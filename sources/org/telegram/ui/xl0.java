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
public final class xl0 implements RequestDelegate {
    public final jm0 f44605a;
    public final String f44606b;
    public final TL_account.saveSecureValue f44607c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType f44608e;
    public final ArrayList f44609f;
    public final SecureDocument f44610g;
    public final SecureDocument h;
    public final SecureDocument f44611i;
    public final ArrayList f44612j;
    public final String f44613k;
    public final String f44614l;
    public final Runnable f44615m;
    public final yl0 f44616n;
    public final TLRPC.TL_inputSecureValue f44617o;
    public final yl0 f44618p;

    public xl0(yl0 yl0Var, jm0 jm0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, yl0 yl0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f44618p = yl0Var;
        this.f44605a = jm0Var;
        this.f44606b = str;
        this.f44607c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.f44608e = tL_secureRequiredType2;
        this.f44609f = arrayList;
        this.f44610g = secureDocument;
        this.h = secureDocument2;
        this.f44611i = secureDocument3;
        this.f44612j = arrayList2;
        this.f44613k = str2;
        this.f44614l = str3;
        this.f44615m = runnable;
        this.f44616n = yl0Var2;
        this.f44617o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        yl0 yl0Var = this.f44618p;
        final boolean z10 = yl0Var.f44905b;
        final int i10 = yl0Var.f44906c;
        final jm0 jm0Var = this.f44605a;
        final String str = this.f44606b;
        final TL_account.saveSecureValue savesecurevalue = this.f44607c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.f44608e;
        final ArrayList arrayList = this.f44609f;
        final SecureDocument secureDocument = this.f44610g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f44611i;
        final ArrayList arrayList2 = this.f44612j;
        final String str2 = this.f44613k;
        final String str3 = this.f44614l;
        final Runnable runnable = this.f44615m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                vm0 vm0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                yl0 yl0Var2 = xl0.this.f44618p;
                vm0 vm0Var2 = yl0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                if (tL_error2 != null) {
                    jm0 jm0Var2 = jm0Var;
                    if (jm0Var2 != null) {
                        jm0Var2.M(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.o2) vm0Var2).currentAccount;
                    org.telegram.ui.Components.c5.f0(i11, tL_error2, vm0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        vm0Var2.H1(tL_secureRequiredType4);
                    } else {
                        vm0Var2.H1(tL_secureRequiredType5);
                    }
                } else {
                    vm0Var2.H1(tL_secureRequiredType5);
                    vm0Var2.H1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    vm0Var2.f43678y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    vm0Var2.f43678y.values.add(tL_secureValue4);
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
                                    vm0Var = vm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        yl0.a(yl0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    vm0Var = vm0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i13++;
                                vm0Var2 = vm0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        vm0Var = vm0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i12++;
                        vm0Var2 = vm0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                    }
                }
                vm0 vm0Var3 = vm0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            yl0.a(yl0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            yl0.a(yl0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            yl0.a(yl0Var2, secureDocument7, tL_secureFile4);
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
                                        yl0.a(yl0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                vm0Var3.L1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        xl0 xl0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        vm0 vm0Var = this.f44618p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f44606b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new eg.f0(this, this.f44606b, this.f44608e, this.f44616n, this.f44605a, 13));
                return;
            }
            xl0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new xe0(xl0Var.f44605a, tL_error, str, 11));
                return;
            }
        } else {
            xl0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = xl0Var.f44617o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = vm0Var.X0;
            i10 = ((org.telegram.ui.ActionBar.o2) vm0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new u80(10, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
