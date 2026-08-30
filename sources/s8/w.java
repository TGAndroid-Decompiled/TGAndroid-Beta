package s8;
public final class w {
    public final Object f44158a;
    public final Object f44159b;
    public final Object f44160c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f44158a = obj;
        this.f44159b = obj2;
        this.f44160c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f44158a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f44159b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f44160c);
        StringBuilder sb = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
