package p8;

public final class a0 {

    public final Object f45523a;

    public final Object f45524b;

    public final Object f45525c;

    public a0(Object obj, Object obj2, Object obj3) {
        this.f45523a = obj;
        this.f45524b = obj2;
        this.f45525c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f45523a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.f45524b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.f45525c);
        StringBuilder sb2 = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        sb2.append(" and ");
        sb2.append(strValueOf3);
        sb2.append("=");
        sb2.append(strValueOf4);
        return new IllegalArgumentException(sb2.toString());
    }
}
