package r5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import l7.w0;
import org.telegram.ui.Components.zz;
import q5.f0;
public final class j extends a7.c {
    public final int f43396b = 0;
    public final Object f43397c;

    public j(af.a aVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.f43397c = aVar;
    }

    @Override
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        int i11;
        long g10;
        boolean z4;
        String str;
        CastDevice castDevice;
        CastDevice castDevice2;
        int i12 = this.f43396b;
        Object obj = this.f43397c;
        switch (i12) {
            case 0:
                af.a aVar = (af.a) obj;
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
                    com.google.android.gms.internal.cast.t.b(parcel);
                    aVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    return true;
                }
                l6.b bVar = new l6.b(aVar);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, bVar);
                return true;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        l6.b bVar2 = new l6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.t.d(parcel2, bVar2);
                        return true;
                    case 2:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).i((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.t.f3146a;
                        if (parcel.readInt() != 0) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i11);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e) {
                                c.f43378m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        c cVar2 = (c) fVar;
                        b6.m.e("Must be called from the main thread.");
                        s5.h hVar = cVar2.f43383j;
                        if (hVar == null) {
                            g10 = 0;
                        } else {
                            g10 = hVar.g() - cVar2.f43383j.a();
                        }
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        return true;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        return true;
                    case 7:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f43384k = CastDevice.e((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        ((c) fVar).f43384k = CastDevice.e((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        com.google.android.gms.internal.cast.t.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice e6 = CastDevice.e((Bundle) com.google.android.gms.internal.cast.t.a(parcel, Bundle.CREATOR));
                        if (e6 != null) {
                            String str2 = e6.d;
                            if (!e6.equals(cVar3.f43384k)) {
                                if (!TextUtils.isEmpty(str2) && ((castDevice2 = cVar3.f43384k) == null || !TextUtils.equals(castDevice2.d, str2))) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                cVar3.f43384k = e6;
                                u5.b bVar3 = c.f43378m;
                                if (true != z4) {
                                    str = "unchanged";
                                } else {
                                    str = "changed";
                                }
                                bVar3.b("update to device (%s) with name %s", e6, str);
                                if (z4 && (castDevice = cVar3.f43384k) != null) {
                                    t5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        u5.b bVar4 = t5.h.v;
                                        Log.i(bVar4.f45160a, bVar4.d("update Cast device to %s", castDevice));
                                        hVar2.f44669o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((e0) it.next()).getClass();
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
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar5 = eVar.d;
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
                        String str3 = eVar.f3020b;
                        parcel2.writeNoException();
                        parcel2.writeString(str3);
                        return true;
                    }
                    boolean z10 = bVar5.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.t.f3146a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    return true;
                }
                String readString = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                l6.a f10 = new c(eVar.f3019a, eVar.f3020b, readString, eVar.d, eVar.e, new t5.h(eVar.f3019a, bVar5, eVar.e)).f();
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.t.d(parcel2, f10);
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
                            com.google.android.gms.internal.cast.t.b(parcel);
                            c.g(cVar4, readInt2);
                            parcel2.writeNoException();
                            return true;
                        }
                        String readString2 = parcel.readString();
                        com.google.android.gms.internal.cast.t.b(parcel);
                        f0 f0Var = cVar4.f43382i;
                        if (f0Var != null && f0Var.F == 2) {
                            com.google.android.gms.common.api.internal.v e10 = com.google.android.gms.common.api.internal.w.e();
                            e10.f2868c = new q5.c0(0, f0Var, readString2);
                            e10.f2866a = 8409;
                            f0Var.e(1, e10.e());
                        }
                        parcel2.writeNoException();
                        return true;
                    }
                    String readString3 = parcel.readString();
                    q5.i iVar = (q5.i) com.google.android.gms.internal.cast.t.a(parcel, q5.i.CREATOR);
                    com.google.android.gms.internal.cast.t.b(parcel);
                    f0 f0Var2 = cVar4.f43382i;
                    if (f0Var2 != null && f0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v e11 = com.google.android.gms.common.api.internal.w.e();
                        e11.f2868c = new w0(f0Var2, readString3, iVar);
                        e11.f2866a = 8406;
                        f0Var2.e(1, e11.e()).addOnCompleteListener(new o3.c(this, 15));
                    }
                    parcel2.writeNoException();
                    return true;
                }
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                com.google.android.gms.internal.cast.t.b(parcel);
                f0 f0Var3 = cVar4.f43382i;
                if (f0Var3 != null && f0Var3.F == 2) {
                    com.google.android.gms.common.api.internal.v e12 = com.google.android.gms.common.api.internal.w.e();
                    e12.f2868c = new q5.b0(f0Var3, readString4, readString5, 0);
                    e12.f2866a = 8407;
                    f0Var3.e(1, e12.e()).addOnCompleteListener(new zz(this, 12));
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
                com.google.android.gms.internal.cast.t.b(parcel);
                t5.b.a((t5.b) obj, new Long[]{Long.valueOf(readLong), Long.valueOf(readLong2)});
                parcel2.writeNoException();
                return true;
        }
    }

    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.f43397c = eVar;
    }

    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.f43397c = cVar;
    }

    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.f43397c = fVar;
    }

    public j(t5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.f43397c = bVar;
    }
}
