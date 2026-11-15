package r7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g7.e;
public abstract class a extends Binder implements IInterface {
    @Override
    public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i10) {
        if (i7 > 16777215) {
            if (super.onTransact(i7, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        e eVar = (e) this;
        if (i7 != 1) {
            boolean z10 = false;
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return false;
                        }
                        String stringFlagValue = eVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                        return true;
                    }
                    long longFlagValue = eVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(longFlagValue);
                    return true;
                }
                int intFlagValue = eVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            }
            String readString = parcel.readString();
            int i11 = b.f55906a;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            boolean booleanFlagValue = eVar.getBooleanFlagValue(readString, z10, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        eVar.init(a7.b.m1(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }
}
