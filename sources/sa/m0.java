package sa;
public class m0 extends pa.u {
    @Override
    public final Object read(xa.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return new StringBuffer(aVar.v());
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        String stringBuffer;
        StringBuffer stringBuffer2 = (StringBuffer) obj;
        if (stringBuffer2 == null) {
            stringBuffer = null;
        } else {
            stringBuffer = stringBuffer2.toString();
        }
        bVar.r(stringBuffer);
    }
}
