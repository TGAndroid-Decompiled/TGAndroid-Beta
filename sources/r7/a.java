package r7;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import g7.f;
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
        f fVar = (f) this;
        if (i7 != 1) {
            boolean z9 = false;
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            return false;
                        }
                        String stringFlagValue = fVar.getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
                        parcel2.writeNoException();
                        parcel2.writeString(stringFlagValue);
                        return true;
                    }
                    long longFlagValue = fVar.getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(longFlagValue);
                    return true;
                }
                int intFlagValue = fVar.getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeInt(intFlagValue);
                return true;
            }
            String readString = parcel.readString();
            int i11 = b.f54435a;
            if (parcel.readInt() != 0) {
                z9 = true;
            }
            boolean booleanFlagValue = fVar.getBooleanFlagValue(readString, z9, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        fVar.init(a7.b.m1(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }
}
