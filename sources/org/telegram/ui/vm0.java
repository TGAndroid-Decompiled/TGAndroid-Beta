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
public final class vm0 implements RequestDelegate {
    public final hn0 f41033a;
    public final String f41034b;
    public final TL_account.saveSecureValue f41035c;
    public final TLRPC.TL_secureRequiredType d;
    public final TLRPC.TL_secureRequiredType e;
    public final ArrayList f41036f;
    public final SecureDocument f41037g;
    public final SecureDocument h;
    public final SecureDocument f41038i;
    public final ArrayList f41039j;
    public final String f41040k;
    public final String f41041l;
    public final Runnable f41042m;
    public final wm0 f41043n;
    public final TLRPC.TL_inputSecureValue f41044o;
    public final wm0 f41045p;

    public vm0(wm0 wm0Var, hn0 hn0Var, String str, TL_account.saveSecureValue savesecurevalue, TLRPC.TL_secureRequiredType tL_secureRequiredType, TLRPC.TL_secureRequiredType tL_secureRequiredType2, ArrayList arrayList, SecureDocument secureDocument, SecureDocument secureDocument2, SecureDocument secureDocument3, ArrayList arrayList2, String str2, String str3, Runnable runnable, wm0 wm0Var2, TLRPC.TL_inputSecureValue tL_inputSecureValue) {
        this.f41045p = wm0Var;
        this.f41033a = hn0Var;
        this.f41034b = str;
        this.f41035c = savesecurevalue;
        this.d = tL_secureRequiredType;
        this.e = tL_secureRequiredType2;
        this.f41036f = arrayList;
        this.f41037g = secureDocument;
        this.h = secureDocument2;
        this.f41038i = secureDocument3;
        this.f41039j = arrayList2;
        this.f41040k = str2;
        this.f41041l = str3;
        this.f41042m = runnable;
        this.f41043n = wm0Var2;
        this.f41044o = tL_inputSecureValue;
    }

    public final void a(final TLRPC.TL_error tL_error, final TLRPC.TL_secureValue tL_secureValue, final TLRPC.TL_secureValue tL_secureValue2) {
        wm0 wm0Var = this.f41045p;
        final boolean z10 = wm0Var.f41620b;
        final int i10 = wm0Var.f41621c;
        final hn0 hn0Var = this.f41033a;
        final String str = this.f41034b;
        final TL_account.saveSecureValue savesecurevalue = this.f41035c;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType = this.d;
        final TLRPC.TL_secureRequiredType tL_secureRequiredType2 = this.e;
        final ArrayList arrayList = this.f41036f;
        final SecureDocument secureDocument = this.f41037g;
        final SecureDocument secureDocument2 = this.h;
        final SecureDocument secureDocument3 = this.f41038i;
        final ArrayList arrayList2 = this.f41039j;
        final String str2 = this.f41040k;
        final String str3 = this.f41041l;
        final Runnable runnable = this.f41042m;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                un0 un0Var;
                TLRPC.TL_secureRequiredType tL_secureRequiredType3;
                int i11;
                wm0 wm0Var2 = vm0.this.f41045p;
                un0 un0Var2 = wm0Var2.d;
                TLRPC.TL_error tL_error2 = tL_error;
                String str4 = str;
                int i12 = 0;
                if (tL_error2 != null) {
                    hn0 hn0Var2 = hn0Var;
                    if (hn0Var2 != null) {
                        hn0Var2.o(tL_error2.text, str4);
                    }
                    i11 = ((org.telegram.ui.ActionBar.m2) un0Var2).currentAccount;
                    org.telegram.ui.Components.g5.e0(i11, tL_error2, un0Var2, savesecurevalue, str4);
                    return;
                }
                boolean z11 = z10;
                TLRPC.TL_secureRequiredType tL_secureRequiredType4 = tL_secureRequiredType;
                TLRPC.TL_secureRequiredType tL_secureRequiredType5 = tL_secureRequiredType2;
                if (z11) {
                    if (tL_secureRequiredType4 != null) {
                        un0Var2.G1(tL_secureRequiredType4);
                    } else {
                        un0Var2.G1(tL_secureRequiredType5);
                    }
                } else {
                    un0Var2.G1(tL_secureRequiredType5);
                    un0Var2.G1(tL_secureRequiredType4);
                }
                TLRPC.TL_secureValue tL_secureValue3 = tL_secureValue;
                if (tL_secureValue3 != null) {
                    un0Var2.f40774y.values.add(tL_secureValue3);
                }
                TLRPC.TL_secureValue tL_secureValue4 = tL_secureValue2;
                if (tL_secureValue4 != null) {
                    un0Var2.f40774y.values.add(tL_secureValue4);
                }
                ArrayList arrayList3 = arrayList;
                if (arrayList3 != null && !arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size) {
                        SecureDocument secureDocument4 = (SecureDocument) arrayList3.get(i13);
                        if (secureDocument4.inputFile != null) {
                            int size2 = tL_secureValue3.files.size();
                            int i14 = i12;
                            while (i14 < size2) {
                                TLRPC.SecureFile secureFile = tL_secureValue3.files.get(i14);
                                if (secureFile instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile = (TLRPC.TL_secureFile) secureFile;
                                    un0Var = un0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                    if (Utilities.arraysEquals(secureDocument4.fileSecret, 0, tL_secureFile.secret, 0)) {
                                        wm0.a(wm0Var2, secureDocument4, tL_secureFile);
                                        break;
                                    }
                                } else {
                                    un0Var = un0Var2;
                                    tL_secureRequiredType3 = tL_secureRequiredType5;
                                }
                                i14++;
                                un0Var2 = un0Var;
                                tL_secureRequiredType5 = tL_secureRequiredType3;
                            }
                        }
                        un0Var = un0Var2;
                        tL_secureRequiredType3 = tL_secureRequiredType5;
                        i13++;
                        un0Var2 = un0Var;
                        tL_secureRequiredType5 = tL_secureRequiredType3;
                        i12 = 0;
                    }
                }
                un0 un0Var3 = un0Var2;
                TLRPC.TL_secureRequiredType tL_secureRequiredType6 = tL_secureRequiredType5;
                SecureDocument secureDocument5 = secureDocument;
                if (secureDocument5 != null && secureDocument5.inputFile != null) {
                    TLRPC.SecureFile secureFile2 = tL_secureValue3.selfie;
                    if (secureFile2 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) secureFile2;
                        if (Utilities.arraysEquals(secureDocument5.fileSecret, 0, tL_secureFile2.secret, 0)) {
                            wm0.a(wm0Var2, secureDocument5, tL_secureFile2);
                        }
                    }
                }
                SecureDocument secureDocument6 = secureDocument2;
                if (secureDocument6 != null && secureDocument6.inputFile != null) {
                    TLRPC.SecureFile secureFile3 = tL_secureValue3.front_side;
                    if (secureFile3 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile3 = (TLRPC.TL_secureFile) secureFile3;
                        if (Utilities.arraysEquals(secureDocument6.fileSecret, 0, tL_secureFile3.secret, 0)) {
                            wm0.a(wm0Var2, secureDocument6, tL_secureFile3);
                        }
                    }
                }
                SecureDocument secureDocument7 = secureDocument3;
                if (secureDocument7 != null && secureDocument7.inputFile != null) {
                    TLRPC.SecureFile secureFile4 = tL_secureValue3.reverse_side;
                    if (secureFile4 instanceof TLRPC.TL_secureFile) {
                        TLRPC.TL_secureFile tL_secureFile4 = (TLRPC.TL_secureFile) secureFile4;
                        if (Utilities.arraysEquals(secureDocument7.fileSecret, 0, tL_secureFile4.secret, 0)) {
                            wm0.a(wm0Var2, secureDocument7, tL_secureFile4);
                        }
                    }
                }
                ArrayList arrayList4 = arrayList2;
                if (arrayList4 != null && !arrayList4.isEmpty()) {
                    int size3 = arrayList4.size();
                    for (int i15 = 0; i15 < size3; i15++) {
                        SecureDocument secureDocument8 = (SecureDocument) arrayList4.get(i15);
                        if (secureDocument8.inputFile != null) {
                            int size4 = tL_secureValue3.translation.size();
                            for (int i16 = 0; i16 < size4; i16++) {
                                TLRPC.SecureFile secureFile5 = tL_secureValue3.translation.get(i16);
                                if (secureFile5 instanceof TLRPC.TL_secureFile) {
                                    TLRPC.TL_secureFile tL_secureFile5 = (TLRPC.TL_secureFile) secureFile5;
                                    if (Utilities.arraysEquals(secureDocument8.fileSecret, 0, tL_secureFile5.secret, 0)) {
                                        wm0.a(wm0Var2, secureDocument8, tL_secureFile5);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                un0Var3.K1(tL_secureRequiredType6, str4, str2, tL_secureRequiredType4, str3, z11, i10);
                runnable.run();
            }
        });
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        vm0 vm0Var;
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        int i10;
        int i11;
        un0 un0Var = this.f41045p.d;
        if (tL_error != null) {
            boolean equals = tL_error.text.equals("EMAIL_VERIFICATION_NEEDED");
            String str = this.f41034b;
            if (equals) {
                TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposePassport();
                sendverifyemailcode.email = str;
                i11 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(sendverifyemailcode, new di.fd(this, this.f41034b, this.e, this.f41043n, this.f41033a, 10));
                return;
            }
            vm0Var = this;
            if (tL_error.text.equals("PHONE_VERIFICATION_NEEDED")) {
                AndroidUtilities.runOnUIThread(new uf0(vm0Var.f41033a, tL_error, str, 11));
                return;
            }
        } else {
            vm0Var = this;
        }
        if (tL_error == null && (tL_inputSecureValue = vm0Var.f41044o) != null) {
            TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
            savesecurevalue.value = tL_inputSecureValue;
            savesecurevalue.secure_secret_id = un0Var.f40724b1;
            i10 = ((org.telegram.ui.ActionBar.m2) un0Var).currentAccount;
            ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new fc0(7, this, (TLRPC.TL_secureValue) tLObject));
            return;
        }
        a(tL_error, (TLRPC.TL_secureValue) tLObject, null);
    }
}
