package p2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Parcel;
import j$.util.Objects;
import java.util.concurrent.Callable;
public final class r implements Callable {
    public final int f45485a;
    public final Object f45486b;
    public final Object f45487c;
    public final Object d;

    public r(Object obj, Object obj2, Object obj3, int i10) {
        this.f45485a = i10;
        this.f45486b = obj;
        this.f45487c = obj2;
        this.d = obj3;
    }

    private final java.lang.Object a() {
        throw new UnsupportedOperationException("Method not decompiled: p2.r.a():java.lang.Object");
    }

    private final java.lang.Object b() {
        throw new UnsupportedOperationException("Method not decompiled: p2.r.b():java.lang.Object");
    }

    private final Object c() {
        Bundle c3;
        com.google.android.gms.internal.play_billing.c cVar;
        b bVar = (b) this.f45486b;
        String str = (String) this.f45487c;
        String str2 = (String) this.d;
        try {
            synchronized (bVar.f45421a) {
                cVar = bVar.f45427i;
            }
            if (cVar == null) {
                return com.google.android.gms.internal.play_billing.u.c(107, z.h);
            }
            return ((com.google.android.gms.internal.play_billing.a) cVar).W0(bVar.f45426g.getPackageName(), str, str2);
        } catch (DeadObjectException e10) {
            g gVar = z.h;
            String a2 = x.a(e10);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, gVar);
            if (a2 != null) {
                c3.putString("ADDITIONAL_LOG_DETAILS", a2);
            }
            return c3;
        } catch (Exception e11) {
            g gVar2 = z.f45503f;
            String a10 = x.a(e11);
            c3 = com.google.android.gms.internal.play_billing.u.c(5, gVar2);
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
        switch (this.f45485a) {
            case 0:
                b bVar = (b) this.f45486b;
                h hVar = (h) this.f45487c;
                g5.c cVar2 = (g5.c) this.d;
                if (!bVar.n()) {
                    g gVar = z.h;
                    bVar.y(2, 4, gVar);
                    hVar.a(gVar, cVar2.f7032a);
                    return null;
                }
                String str2 = "Error consuming purchase with token. Response code: ";
                String str3 = cVar2.f7032a;
                try {
                    com.google.android.gms.internal.play_billing.u.g("BillingClient", "Consuming purchase with token: ".concat(str3));
                    try {
                        synchronized (bVar.f45421a) {
                            try {
                                cVar = bVar.f45427i;
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
                                    bVar.g(hVar, str2, z.h, 107, "Service has been reset to null.", null);
                                    return null;
                                } catch (DeadObjectException e10) {
                                    e = e10;
                                    deadObjectException = e;
                                    bVar.g(hVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                                    return null;
                                } catch (Exception e11) {
                                    e = e11;
                                    exc = e;
                                    bVar.g(hVar, str2, z.f45503f, 29, "Error consuming purchase!", exc);
                                    return null;
                                }
                            }
                            if (bVar.f45432n) {
                                String packageName = bVar.f45426g.getPackageName();
                                boolean z10 = bVar.f45432n;
                                String str4 = bVar.f45423c;
                                String str5 = bVar.d;
                                long longValue = bVar.A.longValue();
                                Bundle bundle = new Bundle();
                                if (z10) {
                                    com.google.android.gms.internal.play_billing.u.b(bundle, str4, str5, longValue);
                                }
                                Bundle V0 = ((com.google.android.gms.internal.play_billing.a) cVar).V0(packageName, str3, bundle);
                                readInt = V0.getInt("RESPONSE_CODE");
                                str = com.google.android.gms.internal.play_billing.u.f("BillingClient", V0);
                            } else {
                                String packageName2 = bVar.f45426g.getPackageName();
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
                            g a2 = z.a(readInt, str);
                            if (readInt == 0) {
                                com.google.android.gms.internal.play_billing.u.g("BillingClient", "Successfully consumed purchase.");
                                hVar.a(a2, str3);
                                return null;
                            }
                            bVar.g(hVar, str3, a2, 23, "Error consuming purchase with token. Response code: " + readInt, null);
                            return null;
                        } catch (DeadObjectException e12) {
                            deadObjectException = e12;
                            str2 = str3;
                            bVar.g(hVar, str2, z.h, 29, "Error consuming purchase!", deadObjectException);
                            return null;
                        } catch (Exception e13) {
                            exc = e13;
                            str2 = str3;
                            bVar.g(hVar, str2, z.f45503f, 29, "Error consuming purchase!", exc);
                            return null;
                        }
                    } catch (DeadObjectException e14) {
                        e = e14;
                    } catch (Exception e15) {
                        e = e15;
                    }
                } catch (DeadObjectException e16) {
                    e = e16;
                    str2 = str3;
                } catch (Exception e17) {
                    e = e17;
                    str2 = str3;
                }
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                return Boolean.valueOf(((SharedPreferences) this.f45486b).getBoolean((String) this.f45487c, ((Boolean) this.d).booleanValue()));
            case 5:
                return Integer.valueOf(((SharedPreferences) this.f45486b).getInt((String) this.f45487c, ((Integer) this.d).intValue()));
            case 6:
                return Long.valueOf(((SharedPreferences) this.f45486b).getLong((String) this.f45487c, ((Long) this.d).longValue()));
            default:
                return ((SharedPreferences) this.f45486b).getString((String) this.f45487c, (String) this.d);
        }
    }

    public r(b bVar, m mVar, String str) {
        this.f45485a = 2;
        this.f45487c = mVar;
        this.d = str;
        Objects.requireNonNull(bVar);
        this.f45486b = bVar;
    }
}
