package z5;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import w7.d0;
public final class d implements Parcelable.Creator {
    public final int f50769a;

    public d(int i10) {
        this.f50769a = i10;
    }

    @Override
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f50769a) {
            case 0:
                int z10 = d0.z(parcel);
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Uri uri = null;
                String str5 = null;
                String str6 = null;
                ArrayList arrayList = null;
                String str7 = null;
                String str8 = null;
                long j3 = 0;
                int i10 = 0;
                while (parcel.dataPosition() < z10) {
                    int readInt = parcel.readInt();
                    switch ((char) readInt) {
                        case 1:
                            i10 = d0.u(parcel, readInt);
                            break;
                        case 2:
                            str = d0.h(parcel, readInt);
                            break;
                        case 3:
                            str2 = d0.h(parcel, readInt);
                            break;
                        case 4:
                            str3 = d0.h(parcel, readInt);
                            break;
                        case 5:
                            str4 = d0.h(parcel, readInt);
                            break;
                        case 6:
                            uri = (Uri) d0.g(parcel, readInt, Uri.CREATOR);
                            break;
                        case 7:
                            str5 = d0.h(parcel, readInt);
                            break;
                        case '\b':
                            j3 = d0.w(parcel, readInt);
                            break;
                        case '\t':
                            str6 = d0.h(parcel, readInt);
                            break;
                        case '\n':
                            arrayList = d0.l(parcel, readInt, Scope.CREATOR);
                            break;
                        case 11:
                            str7 = d0.h(parcel, readInt);
                            break;
                        case '\f':
                            str8 = d0.h(parcel, readInt);
                            break;
                        default:
                            d0.y(parcel, readInt);
                            break;
                    }
                }
                d0.m(parcel, z10);
                return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j3, str6, arrayList, str7, str8);
            case 1:
                int z11 = d0.z(parcel);
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                Account account = null;
                String str9 = null;
                String str10 = null;
                String str11 = null;
                int i11 = 0;
                boolean z12 = false;
                boolean z13 = false;
                boolean z14 = false;
                while (parcel.dataPosition() < z11) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i11 = d0.u(parcel, readInt2);
                            break;
                        case 2:
                            arrayList3 = d0.l(parcel, readInt2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) d0.g(parcel, readInt2, Account.CREATOR);
                            break;
                        case 4:
                            z12 = d0.n(parcel, readInt2);
                            break;
                        case 5:
                            z13 = d0.n(parcel, readInt2);
                            break;
                        case 6:
                            z14 = d0.n(parcel, readInt2);
                            break;
                        case 7:
                            str9 = d0.h(parcel, readInt2);
                            break;
                        case '\b':
                            str10 = d0.h(parcel, readInt2);
                            break;
                        case '\t':
                            arrayList2 = d0.l(parcel, readInt2, a6.a.CREATOR);
                            break;
                        case '\n':
                            str11 = d0.h(parcel, readInt2);
                            break;
                        default:
                            d0.y(parcel, readInt2);
                            break;
                    }
                }
                d0.m(parcel, z11);
                return new GoogleSignInOptions(i11, arrayList3, account, z12, z13, z14, str9, str10, GoogleSignInOptions.c(arrayList2), str11);
            default:
                int z15 = d0.z(parcel);
                String str12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String str13 = "";
                while (parcel.dataPosition() < z15) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 4) {
                        if (c10 != 7) {
                            if (c10 != '\b') {
                                d0.y(parcel, readInt3);
                            } else {
                                str13 = d0.h(parcel, readInt3);
                            }
                        } else {
                            googleSignInAccount = (GoogleSignInAccount) d0.g(parcel, readInt3, GoogleSignInAccount.CREATOR);
                        }
                    } else {
                        str12 = d0.h(parcel, readInt3);
                    }
                }
                d0.m(parcel, z15);
                return new SignInAccount(str12, googleSignInAccount, str13);
        }
    }

    @Override
    public final Object[] newArray(int i10) {
        switch (this.f50769a) {
            case 0:
                return new GoogleSignInAccount[i10];
            case 1:
                return new GoogleSignInOptions[i10];
            default:
                return new SignInAccount[i10];
        }
    }
}
