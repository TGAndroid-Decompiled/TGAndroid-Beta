package p2;
public final class h {
    public int f44145a;
    public int f44146b;
    public String f44147c;

    public static g a() {
        ?? obj = new Object();
        obj.f44143b = 0;
        obj.f44144c = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f44145a;
        int i11 = com.google.android.gms.internal.play_billing.u.f3599a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f3504c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return e2.c.k("Response Code: ", jVar.toString(), ", Debug Message: ", this.f44147c);
    }
}
