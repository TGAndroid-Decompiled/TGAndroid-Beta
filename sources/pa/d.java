package pa;
public final class d extends u {
    public final int f41075a;

    @Override
    public final Object read(xa.a aVar) {
        switch (this.f41075a) {
            case 0:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return Double.valueOf(aVar.o());
            case 1:
                if (aVar.x() == 9) {
                    aVar.t();
                    return null;
                }
                return Float.valueOf((float) aVar.o());
            default:
                aVar.C();
                return null;
        }
    }

    public String toString() {
        switch (this.f41075a) {
            case 2:
                return "AnonymousOrNonStaticLocalClassAdapter";
            default:
                return super.toString();
        }
    }

    @Override
    public final void write(xa.b bVar, Object obj) {
        switch (this.f41075a) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    bVar.i();
                    return;
                }
                double doubleValue = number.doubleValue();
                g.a(doubleValue);
                bVar.n(doubleValue);
                return;
            case 1:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    bVar.i();
                    return;
                }
                float floatValue = number2.floatValue();
                g.a(floatValue);
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                bVar.q(number2);
                return;
            default:
                bVar.i();
                return;
        }
    }
}
