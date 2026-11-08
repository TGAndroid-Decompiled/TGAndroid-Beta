package q4;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
public final class k extends Binder implements d {
    public static final int f53783b = 0;
    public final WeakReference f53784a;

    public k(l lVar) {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
        this.f53784a = new WeakReference(lVar);
    }

    public final void h1(b bVar) {
        l lVar = (l) this.f53784a.get();
        if (lVar != null && bVar != null) {
            lVar.f53789f.register(bVar, new r("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
            synchronized (lVar.d) {
            }
        }
    }

    @Override
    public final boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        long j3;
        Bundle bundle;
        b bVar = null;
        r5 = null;
        Bundle bundle2 = null;
        w wVar = null;
        b bVar2 = null;
        if (i7 != 3) {
            if (i7 != 4) {
                if (i7 != 28) {
                    int i11 = -1;
                    if (i7 != 37) {
                        if (i7 != 45) {
                            if (i7 != 47) {
                                if (i7 != 50) {
                                    if (i7 != 1598968902) {
                                        return super.onTransact(i7, parcel, parcel2, i10);
                                    }
                                    parcel2.getClass();
                                    parcel2.writeString("android.support.v4.media.session.IMediaSession");
                                    return true;
                                }
                                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                                l lVar = (l) this.f53784a.get();
                                if (lVar != null && (bundle = lVar.f53788e) != null) {
                                    bundle2 = new Bundle(bundle);
                                }
                                parcel2.getClass();
                                parcel2.writeNoException();
                                if (bundle2 != null) {
                                    parcel2.writeInt(1);
                                    bundle2.writeToParcel(parcel2, 1);
                                    return true;
                                }
                                parcel2.writeInt(0);
                                return true;
                            }
                            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                            l lVar2 = (l) this.f53784a.get();
                            if (lVar2 != null) {
                                i11 = lVar2.f53793k;
                            }
                            parcel2.getClass();
                            parcel2.writeNoException();
                            parcel2.writeInt(i11);
                            return true;
                        }
                        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                        l lVar3 = (l) this.f53784a.get();
                        parcel2.getClass();
                        parcel2.writeNoException();
                        parcel2.writeInt(0);
                        return true;
                    }
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    l lVar4 = (l) this.f53784a.get();
                    if (lVar4 != null) {
                        i11 = lVar4.f53792j;
                    }
                    parcel2.getClass();
                    parcel2.writeNoException();
                    parcel2.writeInt(i11);
                    return true;
                }
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                l lVar5 = (l) this.f53784a.get();
                if (lVar5 != null) {
                    wVar = lVar5.f53790g;
                    i iVar = lVar5.f53791i;
                    if (wVar != null) {
                        float f10 = wVar.d;
                        long j10 = wVar.f53820n;
                        int i12 = wVar.f53815a;
                        long j11 = wVar.f53816b;
                        long j12 = -1;
                        if (j11 != -1 && ((i12 == 3 || i12 == 4 || i12 == 5) && j10 > 0)) {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            long j13 = (f10 * ((float) (elapsedRealtime - j10))) + j11;
                            if (iVar != null) {
                                Bundle bundle3 = iVar.f53781a;
                                if (bundle3.containsKey("android.media.metadata.DURATION")) {
                                    j12 = bundle3.getLong("android.media.metadata.DURATION", 0L);
                                }
                            }
                            if (j12 >= 0 && j13 > j12) {
                                j3 = j12;
                            } else if (j13 < 0) {
                                j3 = 0;
                            } else {
                                j3 = j13;
                            }
                            ArrayList arrayList = new ArrayList();
                            long j14 = wVar.f53817c;
                            long j15 = wVar.f53818e;
                            int i13 = wVar.f53819f;
                            CharSequence charSequence = wVar.h;
                            AbstractCollection abstractCollection = wVar.f53821r;
                            if (abstractCollection != null) {
                                arrayList.addAll(abstractCollection);
                            }
                            wVar = new w(wVar.f53815a, j3, j14, wVar.d, j15, i13, charSequence, elapsedRealtime, arrayList, wVar.f53822s, wVar.f53823w);
                        }
                    }
                }
                parcel2.getClass();
                parcel2.writeNoException();
                if (wVar != null) {
                    parcel2.writeInt(1);
                    wVar.writeToParcel(parcel2, 1);
                    return true;
                }
                parcel2.writeInt(0);
                return true;
            }
            parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                if (queryLocalInterface != null && (queryLocalInterface instanceof b)) {
                    bVar2 = (b) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.f53764a = readStrongBinder;
                    bVar2 = obj;
                }
            }
            l lVar6 = (l) this.f53784a.get();
            if (lVar6 != null && bVar2 != null) {
                lVar6.f53789f.unregister(bVar2);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (lVar6.d) {
                }
            }
            parcel2.getClass();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
        IBinder readStrongBinder2 = parcel.readStrongBinder();
        if (readStrongBinder2 != null) {
            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
            if (queryLocalInterface2 != null && (queryLocalInterface2 instanceof b)) {
                bVar = (b) queryLocalInterface2;
            } else {
                ?? obj2 = new Object();
                obj2.f53764a = readStrongBinder2;
                bVar = obj2;
            }
        }
        h1(bVar);
        parcel2.getClass();
        parcel2.writeNoException();
        return true;
    }

    @Override
    public final IBinder asBinder() {
        return this;
    }
}
