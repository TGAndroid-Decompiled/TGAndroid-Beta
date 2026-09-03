package p2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class s implements Callable {
    public final int f44204a;
    public final Object f44205b;
    public final Object f44206c;
    public final Object d;

    public s(Object obj, Object obj2, Object obj3, int i10) {
        this.f44204a = i10;
        this.f44205b = obj;
        this.f44206c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: p2.s.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: p2.s.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c3;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f44205b;
        String str = (String) this.f44206c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f44134a) {
                cVar = bVar.f44140i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, a0.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.f44139g.getPackageName(), str, str2);
        } catch (DeadObjectException e6) {
            h hVar = a0.h;
            String a2 = y.a(e6);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, hVar);
            if (a2 != null) {
                c3.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c3;
        } catch (Exception e10) {
            h hVar2 = a0.f44124f;
            String a10 = y.a(e10);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, hVar2);
            if (a10 != null) {
                c3.putString("ADDITIONAL_LOG_DETAILS", a10);
            }
            return c3;
        }
    }

    @Override
    public final Object call() {
        Exception exc;
        DeadObjectException deadObjectException;
        com.google.android.gms.internal.play_billing.c cVar;
        int readInt;
        String str;
        switch (this.f44204a) {
            case 0:
                b bVar = (b) this.f44205b;
                i iVar = (i) this.f44206c;
                com.google.android.gms.internal.clearcut.e eVar = (com.google.android.gms.internal.clearcut.e) this.d;
                if (!bVar.n()) {
                    h hVar = a0.h;
                    bVar.y(2, 4, hVar);
                    iVar.a(hVar, eVar.f3277b);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = eVar.f3277b;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f44134a) {
                            try {
                                cVar = bVar.f44140i;
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                }
                            }
                        }
                        try {
                            if (cVar == null) {
                                str2 = str3;
                                try {
                                    bVar.g(iVar, str2, a0.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e6) {
                                    e = e6;
                                    deadObjectException = e;
                                    bVar.g(iVar, str2, a0.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e10) {
                                    e = e10;
                                    exc = e;
                                    bVar.g(iVar, str2, a0.f44124f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f44145n) {
                                String packageName = bVar.f44139g.getPackageName();
                                boolean z4 = bVar.f44145n;
                                String str4 = bVar.f44136c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z4) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle V0 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(packageName, str3, bundle);
                                readInt = V0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", V0);
                            } else {
                                String packageName2 = bVar.f44139g.getPackageName();
                                com.google.android.gms.internal.play_billing.a aVar = (com.google.android.gms.internal.play_billing.a) cVar;
                                Parcel S0 = aVar.S0();
                                S0.writeInt(3);
                                S0.writeString(packageName2);
                                S0.writeString(str3);
                                Parcel T0 = aVar.T0(S0, 5);
                                readInt = T0.readInt();
                                T0.recycle();
                                str = "";
                            }
                            h a2 = a0.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                iVar.a(a2, str3);
                                return null;
                            }
                            bVar.g(iVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e11) {
                            deadObjectException = e11;
                            str2 = str3;
                            bVar.g(iVar, str2, a0.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e12) {
                            exc = e12;
                            str2 = str3;
                            bVar.g(iVar, str2, a0.f44124f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e13) {
                        e = e13;
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (DeadObjectException e15) {
                    e = e15;
                    str2 = str3;
                } catch (Exception e16) {
                    e = e16;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f44205b).getBoolean((String) this.f44206c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f44205b).getInt((String) this.f44206c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f44205b).getLong((String) this.f44206c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f44205b).getString((String) this.f44206c, (String) this.d);
        }
    }

    public s(b bVar, n nVar, String str) {
        this.f44204a = 2;
        this.f44206c = nVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f44205b = bVar;
    }
}
