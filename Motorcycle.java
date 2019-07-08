public abstract class Motorcycle implements Vehicle
{
    protected String _make;
    protected String _model;
    protected int _year;
    protected int _wheels;

    public int GetWheels()
    {
        return _wheels;
    }

    public String GetMake()
    {
        return _make;
    }

    public String GetModel()
    {
        return _model;
    }

    public int GetYear()
    {
        return _year;
    }

    public String GetType()
    {
        return "Motorcycle";
    }
}