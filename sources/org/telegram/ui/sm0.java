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
public final class sm0 implements RequestDelegate {
    public final en0 f37520a;
    public final String f37521b;
    public final TL_account.saveSecureValue f37522c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f37523f;
    public final SecureDocument f37524g;
    public final SecureDocument h;
    public final SecureDocument f37525i;
    public final ArrayList f37526j;
    public final String f37527k;
    public final String f37528l;
    public final Runnable f37529m;
    public final tm0 f37530n;
    public final TLRPC.TL_inputSecureValue f37531o;
    public final tm0 f37532p;

    public sm0(tm0 tm0Var, en0 en0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, tm0 tm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f37532p = tm0Var;
        this.f37520a = en0Var;
        this.f37521b = str;
        this.f37522c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f37523f = arrayList;
        this.f37524g = secureDocument;
        this.h = secureDocument2;
        this.f37525i = secureDocument3;
        this.f37526j = arrayList2;
        this.f37527k = str2;
        this.f37528l = str3;
        this.f37529m = runnable;
        this.f37530n = tm0Var2;
        this.f37531o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        tm0 tm0Var = this.f37532p;
        final boolean z10 = tm0Var.f37840b;
        final int i10 = tm0Var.f37841c;
        final en0 en0Var = this.f37520a;
        final String str = this.f37521b;
        final TL_account.saveSecureValue savesecurevalue = this.f37522c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f37523f;
        final SecureDocument secureDocument = this.f37524g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f37525i;
        final ArrayList arrayList2 = this.f37526j;
        final String str2 = this.f37527k;
        final String str3 = this.f37528l;
        final Runnable runnable = this.f37529m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                qn0 qn0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                tm0 tm0Var2 = sm0.this.f37532p;
                qn0 qn0Var2 = tm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    en0 en0Var2 = en0Var;
                    if (en0Var2 != null) {
                        en0Var2.b(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.o2) qn0Var2).currentAccount;
                    org.telegram.ui.Components.c5.f0(i11, tL_error2, qn0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        qn0Var2.H1(tL_secureRequiredType4);
                    } else {
                        qn0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    qn0Var2.H1(tL_secureRequiredType5);
                    qn0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    qn0Var2.f37002y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    qn0Var2.f37002y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i12);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i13 = 0;
                            while (i13 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i13);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    qn0Var = qn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        tm0.a(tm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    qn0Var = qn0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                qn0Var2 = qn0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        qn0Var = qn0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        qn0Var2 = qn0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                qn0 qn0Var3 = qn0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            tm0.a(tm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            tm0.a(tm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            tm0.a(tm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i14);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i15 = 0; i15 < size4; i15++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i15);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        tm0.a(tm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                qn0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        sm0 sm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        qn0 qn0Var = this.f37532p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f37521b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new ci.kd(this, this.f37521b, this.e, this.f37530n, this.f37520a, 10));
                return;
            }
            sm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new rf0(sm0Var.f37520a, tL_error, str, 11));
                return;
            }
        } else {
            sm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = sm0Var.f37531o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = qn0Var.f36952b1;
            i10 = ((org.telegram.ui.ActionBar.o2) qn0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new dc0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
