package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void findAll() {
        PosterManager manager = new PosterManager();


        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLast() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldOnlyOne() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");

        String[] expected = {"Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Мгла");
        manager.addFilm("Невидимка");
        manager.addFilm("Рембо");
        manager.addFilm("Матрица");
        manager.addFilm("Терминатор");
        manager.addFilm("Апокалипсис");
        manager.addFilm("Дорога");
        manager.addFilm("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Мгла", "Невидимка", "Рембо", "Матрица", "Терминатор", "Апокалипсис", "Дорога", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindAll2() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Рембо");
        manager.addFilm("Матрица");
        manager.addFilm("Терминатор");
        manager.addFilm("Апокалипсис");
        manager.addFilm("Дорога");
        manager.addFilm("Джентельмены");

        String[] expected = {"Бладшот", "Вперед", "Рембо", "Матрица", "Терминатор", "Апокалипсис", "Дорога", "Джентельмены"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Апокалипсис");


        String[] expected = {"Апокалипсис"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast2() {
        PosterManager manager = new PosterManager();
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Мгла");
        manager.addFilm("Невидимка");
        manager.addFilm("Рембо");
        manager.addFilm("Матрица");
        manager.addFilm("Терминатор");

        String[] expected = {"Терминатор", "Матрица", "Рембо", "Невидимка", "Мгла", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast3() {
        PosterManager manager = new PosterManager(4);
        manager.addFilm("Невидимка");
        manager.addFilm("Мгла");
        manager.addFilm("Вперед");
        manager.addFilm("Бладшот");


        String[] expected = {"Бладшот", "Вперед", "Мгла", "Невидимка"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLastNull() {
        PosterManager manager = new PosterManager(0);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast4() {
        PosterManager manager = new PosterManager(1);
        manager.addFilm("Бладшот");


        String[] expected = {"Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast5() {
        PosterManager manager = new PosterManager(11);
        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Мгла");
        manager.addFilm("Невидимка");
        manager.addFilm("Рембо");
        manager.addFilm("Матрица");
        manager.addFilm("Терминатор");
        manager.addFilm("Апокалипсис");
        manager.addFilm("Дорога");
        manager.addFilm("Джентельмены");
        manager.addFilm("Варкрафт");

        String[] expected = {"Варкрафт", "Джентельмены", "Дорога", "Апокалипсис", "Терминатор", "Матрица", "Рембо", "Невидимка", "Мгла", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void shouldFindLast6() {
        PosterManager manager = new PosterManager(10);

        manager.addFilm("Бладшот");
        manager.addFilm("Вперед");
        manager.addFilm("Мгла");
        manager.addFilm("Невидимка");
        manager.addFilm("Рембо");
        manager.addFilm("Матрица");
        manager.addFilm("Терминатор");
        manager.addFilm("Апокалипсис");
        manager.addFilm("Дорога");
        manager.addFilm("Джентельмены");
        manager.addFilm("Варкрафт");

        String[] expected = {"Варкрафт", "Джентельмены", "Дорога", "Апокалипсис", "Терминатор", "Матрица", "Рембо", "Невидимка", "Мгла", "Вперед"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNothing() {
        PosterManager manager = new PosterManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}