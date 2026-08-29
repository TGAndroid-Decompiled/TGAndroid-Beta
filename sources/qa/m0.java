package qa;
public class m0 extends na.u {
    @Override
    public final Object read(va.a aVar) {
        if (aVar.x() == 9) {
            aVar.t();
            return null;
        }
        return new StringBuffer(aVar.v());
    }

    @Override
    public final void write(va.b bVar, Object obj) {
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
