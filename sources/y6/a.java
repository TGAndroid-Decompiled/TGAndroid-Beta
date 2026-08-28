package y6;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import n6.e;
public abstract class a extends Binder implements IInterface {
    @Override
    public boolean onTransact(int i9, Parcel parcel, Parcel parcel2, int i10) {
        if (i9 > 16777215) {
            if (super.onTransact(i9, parcel, parcel2, i10)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        e eVar = (e) this;
        if (i9 != 1) {
            boolean z10 = false;
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
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
            int i11 = b.f49610a;
            if (parcel.readInt() != 0) {
                z10 = true;
            }
            boolean booleanFlagValue = eVar.getBooleanFlagValue(readString, z10, parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(booleanFlagValue ? 1 : 0);
            return true;
        }
        eVar.init(h6.b.J0(parcel.readStrongBinder()));
        parcel2.writeNoException();
        return true;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }
}
