package pf;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.rx;

public final class o implements Runnable {

    public final int f45888a;

    public final z f45889b;

    public final String f45890c;
    public final int d;

    public final String f45891e;

    public o(z zVar, int i10, String str, String str2) {
        this.f45888a = 0;
        this.f45889b = zVar;
        this.d = i10;
        this.f45890c = str;
        this.f45891e = str2;
    }

    @Override
    public final void run() throws Throwable {
        String str;
        int i10;
        switch (this.f45888a) {
            case 0:
                z zVar = this.f45889b;
                int i11 = zVar.R;
                int i12 = zVar.f45983d0;
                zVar.h = null;
                int i13 = zVar.Z;
                int i14 = this.d;
                if (i14 == i13) {
                    if (i11 == 2 || i12 == 6 || i12 == 5) {
                        zVar.f46012z0 -= 2;
                    } else if (zVar.Q.a() == 0) {
                        s sVar = zVar.f45987f0;
                        boolean z10 = i12 != 4;
                        boolean z11 = (i12 == 4 || i12 == 11) ? false : true;
                        boolean z12 = i12 == 2 || i12 == 1;
                        boolean z13 = i12 == 0;
                        rx rxVar = zVar.Q;
                        sVar.h(this.f45890c, true, z10, true, z11, z12, 0L, z13, 0, i14, rxVar != null ? rxVar.a() : 0L, null);
                        i14 = i14;
                    } else {
                        zVar.f46012z0 -= 2;
                    }
                    if (i11 == 0 || i12 == 15) {
                        zVar.f46012z0--;
                    } else {
                        String str2 = this.f45891e;
                        zVar.X(str2);
                        zVar.W(i14, str2);
                        zVar.V(i14, str2);
                    }
                    break;
                }
                break;
            case 1:
                z zVar2 = this.f45889b;
                zVar2.getClass();
                ArrayList<Object> arrayList = new ArrayList<>();
                ArrayList<CharSequence> arrayList2 = new ArrayList<>();
                ArrayList<TLRPC.User> arrayList3 = new ArrayList<>();
                new ArrayList();
                MessagesStorage messagesStorage = MessagesStorage.getInstance(zVar2.f45996o0);
                int i15 = zVar2.f45983d0;
                ArrayList<Long> arrayList4 = zVar2.m0;
                String str3 = this.f45890c;
                messagesStorage.localSearch(i15, str3, arrayList, arrayList2, arrayList3, arrayList4, -1);
                AndroidUtilities.runOnUIThread(new gh.e1(zVar2, this.d, arrayList, arrayList2, arrayList3, 27));
                g0.y1(str3, zVar2.f46004u0);
                zVar2.f46005v0 = false;
                if (str3.length() >= 3 && (LocaleController.getString(R.string.ArchiveSearchFilter).toLowerCase().startsWith(str3) || "archive".startsWith(this.f45891e))) {
                    zVar2.f46005v0 = true;
                }
                AndroidUtilities.runOnUIThread(new p(zVar2, 0));
                break;
            default:
                z zVar3 = this.f45889b;
                zVar3.f45986f = null;
                int i16 = zVar3.R;
                String str4 = this.f45890c;
                int i17 = this.d;
                if (i16 == 2) {
                    str = str4;
                    i10 = i17;
                } else {
                    String lowerCase = str4.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        zVar3.Z = 0;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        new ArrayList();
                        AndroidUtilities.runOnUIThread(new gh.e1(zVar3, zVar3.Z, arrayList5, arrayList6, arrayList7, 27));
                        str = str4;
                        i10 = i17;
                    } else {
                        str = str4;
                        i10 = i17;
                        MessagesStorage.getInstance(zVar3.f45996o0).getStorageQueue().postRunnable(new o(zVar3, lowerCase, i10, str, 1));
                    }
                }
                if (zVar3.f45983d0 != 15) {
                    o oVar = new o(zVar3, i10, str, this.f45891e);
                    zVar3.h = oVar;
                    AndroidUtilities.runOnUIThread(oVar);
                } else {
                    zVar3.f46012z0 -= 2;
                }
                break;
        }
    }

    public o(z zVar, String str, int i10, String str2, int i11) {
        this.f45888a = i11;
        this.f45889b = zVar;
        this.f45890c = str;
        this.d = i10;
        this.f45891e = str2;
    }
}
