package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class zl0 implements RequestDelegate {
    public final lm0 f45172a;
    public final String f45173b;
    public final TL_account.saveSecureValue f45174c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f45175e;
    public final ArrayList f45176f;
    public final SecureDocument f45177g;
    public final SecureDocument h;
    public final SecureDocument f45178i;
    public final ArrayList f45179j;
    public final String f45180k;
    public final String f45181l;
    public final Runnable f45182m;
    public final am0 f45183n;
    public final TLRPC.TL_inputSecureValue f45184o;
    public final am0 f45185p;

    public zl0(am0 am0Var, lm0 lm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, am0 am0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f45185p = am0Var;
        this.f45172a = lm0Var;
        this.f45173b = str;
        this.f45174c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f45175e = tL_secureRequiredType2;
        this.f45176f = arrayList;
        this.f45177g = secureDocument;
        this.h = secureDocument2;
        this.f45178i = secureDocument3;
        this.f45179j = arrayList2;
        this.f45180k = str2;
        this.f45181l = str3;
        this.f45182m = runnable;
        this.f45183n = am0Var2;
        this.f45184o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        am0 am0Var = this.f45185p;
        final boolean z10 = am0Var.f36521b;
        final int i9 = am0Var.f36522c;
        final lm0 lm0Var = this.f45172a;
        final String str = this.f45173b;
        final TL_account.saveSecureValue savesecurevalue = this.f45174c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f45175e;
        final ArrayList arrayList = this.f45176f;
        final SecureDocument secureDocument = this.f45177g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f45178i;
        final ArrayList arrayList2 = this.f45179j;
        final String str2 = this.f45180k;
        final String str3 = this.f45181l;
        final Runnable runnable = this.f45182m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                wm0 wm0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i10;
                am0 am0Var2 = zl0.this.f45185p;
                wm0 wm0Var2 = am0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    lm0 lm0Var2 = lm0Var;
                    if (lm0Var2 != null) {
                        lm0Var2.T(tL_error2.text, str4);
                    }
                    i10 = ((org.telegram.ui.ActionBar.o2) wm0Var2).currentAccount;
                    org.telegram.ui.Components.y4.f0(i10, tL_error2, wm0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        wm0Var2.H1(tL_secureRequiredType4);
                    } else {
                        wm0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    wm0Var2.H1(tL_secureRequiredType5);
                    wm0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    wm0Var2.f44204y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    wm0Var2.f44204y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i11 = 0;
                    while (i11 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i11);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i12 = 0;
                            while (i12 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i12);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    wm0Var = wm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        am0.a(am0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    wm0Var = wm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i12++;
                                wm0Var2 = wm0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        wm0Var = wm0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i11++;
                        wm0Var2 = wm0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                wm0 wm0Var3 = wm0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            am0.a(am0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            am0.a(am0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            am0.a(am0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i13);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i14 = 0; i14 < size4; i14++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i14);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        am0.a(am0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                wm0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i9);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        zl0 zl0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i9;
        int i10;
        wm0 wm0Var = this.f45185p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f45173b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i10 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(sendverifyemailcode, new bg.h0(this, this.f45173b, this.f45175e, this.f45183n, this.f45172a, 13));
                return;
            }
            zl0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new ye0(zl0Var.f45172a, tL_error, str, 11));
                return;
            }
        } else {
            zl0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = zl0Var.f45184o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = wm0Var.X0;
            i9 = ((org.telegram.ui.ActionBar.o2) wm0Var).currentAccount;
            ConnectionsManager.getInstance(i9).sendRequest(savesecurevalue, new v40(14, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
