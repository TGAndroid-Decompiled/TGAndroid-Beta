package s8;
public final class w {
    public final Object f47175a;
    public final Object f47176b;
    public final Object f47177c;

    public w(Object obj, Object obj2, Object obj3) {
        this.f47175a = obj;
        this.f47176b = obj2;
        this.f47177c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f47175a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f47176b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f47177c);
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
