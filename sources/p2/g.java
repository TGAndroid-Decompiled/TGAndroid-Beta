package p2;

import j7.l1;
public final class g {
    public int f45457a;
    public int f45458b;
    public String f45459c;

    public static l3.a a() {
        ?? obj = new Object();
        obj.f14058b = 0;
        obj.f14059c = "";
        return obj;
    }

    public final String toString() {
        com.google.android.gms.internal.play_billing.j jVar;
        int i10 = this.f45457a;
        int i11 = com.google.android.gms.internal.play_billing.u.f4703a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.j.f4612c;
        Integer valueOf = Integer.valueOf(i10);
        if (!a0Var.containsKey(valueOf)) {
            jVar = com.google.android.gms.internal.play_billing.j.RESPONSE_CODE_UNSPECIFIED;
        } else {
            jVar = (com.google.android.gms.internal.play_billing.j) a0Var.get(valueOf);
        }
        return l1.n("Response Code: ", jVar.toString(), ", Debug Message: ", this.f45459c);
    }
}
