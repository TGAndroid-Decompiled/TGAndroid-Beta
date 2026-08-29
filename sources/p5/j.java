package p5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import l3.g0;
import nh.d6;
import o5.e0;
public final class j extends c7.a {
    public final int f45641b = 2;
    public final Object f45642c;

    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f45642c = fVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g10;
        boolean z10;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f45641b;
        Object obj = this.f45642c;
        switch (i12) {
            case 0:
                sg.j jVar = (sg.j) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            return false;
                        }
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    }
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    jVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                j6.b bVar = new j6.b(jVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        j6.b bVar2 = new j6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
                        return true;
                    case 2:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.u.f4281a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.f45625e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i11);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e10) {
                                c.f45623m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        z5.l.e("Must be called from the main thread.");
                        q5.h hVar = cVar2.f45629j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f45629j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f45630k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).f45630k = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b((Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR));
                        if (b10 != null) {
                            String str2 = b10.d;
                            if (!b10.equals(cVar3.f45630k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f45630k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                cVar3.f45630k = b10;
                                s5.b bVar3 = c.f45623m;
                                if (true != z10) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", b10, str);
                                if (z10 && (castDevice = cVar3.f45630k) != null) {
                                    r5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        s5.b bVar4 = r5.h.v;
                                        Log.i(bVar4.f47580a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.f47075o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((d0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        return true;
                    default:
                        return false;
                }
            case 2:
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) obj;
                b bVar5 = fVar2.d;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                return false;
                            }
                            parcel2.writeNoException();
                            parcel2.writeInt(12451000);
                            return true;
                        }
                        String str3 = fVar2.f4137b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z11 = bVar5.f45614e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.u.f4281a;
                    parcel2.writeInt(z11 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                j6.a f9 = new c(fVar2.f4136a, fVar2.f4137b, readString, fVar2.d, fVar2.f4139e, new r5.h(fVar2.f4136a, bVar5, fVar2.f4139e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.u.d(parcel2, f9);
                return true;
            case 3:
                c cVar4 = (c) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                if (i10 != 5) {
                                    return false;
                                }
                                parcel2.writeNoException();
                                parcel2.writeInt(12451000);
                                return true;
                            }
                            int readInt2 = parcel.readInt();
                            com.google.android.gms.internal.cast.u.b(parcel);
                            c.g(cVar4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.u.b(parcel);
                        e0 e0Var = cVar4.f45628i;
                        if (e0Var != null && e0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                            b11.f3928c = new g9.l(e0Var, readString2, false, 27);
                            b11.f3926a = 8409;
                            e0Var.e(1, b11.b());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    o5.i iVar = (o5.i) com.google.android.gms.internal.cast.u.a(parcel, o5.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var2 = cVar4.f45628i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.f3928c = new g0(e0Var2, readString3, iVar, false, 13);
                        b12.f3926a = 8406;
                        e0Var2.e(1, b12.b()).addOnCompleteListener(new org.telegram.ui.Components.n(this, 7));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.u.b(parcel);
                e0 e0Var3 = cVar4.f45628i;
                if (e0Var3 != null && e0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                    b13.f3928c = new o5.b0(e0Var3, readString4, readString5, 0);
                    b13.f3926a = 8407;
                    e0Var3.e(1, b13.b()).addOnCompleteListener(new d6(this, 14));
                }
                parcel2.writeNoException();
                return true;
            default:
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    return true;
                }
                long readLong = parcel.readLong();
                long readLong2 = parcel.readLong();
                com.google.android.gms.internal.cast.u.b(parcel);
                r5.b.a((r5.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f45642c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f45642c = fVar;
    }

    public j(r5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f45642c = bVar;
    }

    public j(sg.j jVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f45642c = jVar;
    }
}
