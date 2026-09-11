package org.telegram.ui;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class sm0 implements fn0 {
    public final TLRPC.SecureValueType f40474a;
    public final boolean f40475b;
    public final int f40476c;
    public final pn0 d;

    public sm0(pn0 pn0Var, TLRPC.SecureValueType secureValueType, boolean z10, int i10) {
        this.d = pn0Var;
        this.f40474a = secureValueType;
        this.f40475b = z10;
        this.f40476c = i10;
    }

    public static void a(sm0 sm0Var, SecureDocument secureDocument, TLRPC.TL_secureFile tL_secureFile) {
        sm0Var.getClass();
        File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(secureDocument);
        File pathToAttach2 = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_secureFile);
        pathToAttach.renameTo(pathToAttach2);
        ImageLoader.getInstance().replaceImageInCache(secureDocument.secureFile.dc_id + "_" + secureDocument.secureFile.f20004id, tL_secureFile.dc_id + "_" + tL_secureFile.f20004id, null, false);
    }

    public static TLRPC.InputSecureFile b(SecureDocument secureDocument) {
        if (secureDocument.inputFile != null) {
            TLRPC.TL_inputSecureFileUploaded tL_inputSecureFileUploaded = new TLRPC.TL_inputSecureFileUploaded();
            TLRPC.TL_inputFile tL_inputFile = secureDocument.inputFile;
            tL_inputSecureFileUploaded.f19937id = tL_inputFile.f19883id;
            tL_inputSecureFileUploaded.parts = tL_inputFile.parts;
            tL_inputSecureFileUploaded.md5_checksum = tL_inputFile.md5_checksum;
            tL_inputSecureFileUploaded.file_hash = secureDocument.fileHash;
            tL_inputSecureFileUploaded.secret = secureDocument.fileSecret;
            return tL_inputSecureFileUploaded;
        }
        TLRPC.TL_inputSecureFile tL_inputSecureFile = new TLRPC.TL_inputSecureFile();
        TLRPC.TL_secureFile tL_secureFile = secureDocument.secureFile;
        tL_inputSecureFile.f19936id = tL_secureFile.f20004id;
        tL_inputSecureFile.access_hash = tL_secureFile.access_hash;
        return tL_inputSecureFile;
    }

    public final void c(TLRPC.TL_secureRequiredType tL_secureRequiredType, String str, String str2, TLRPC.TL_secureRequiredType tL_secureRequiredType2, String str3, ArrayList arrayList, SecureDocument secureDocument, ArrayList arrayList2, SecureDocument secureDocument2, SecureDocument secureDocument3, Runnable runnable, o0.a aVar) {
        TLRPC.TL_inputSecureValue tL_inputSecureValue;
        TLRPC.TL_securePlainPhone tL_securePlainPhone;
        TLRPC.TL_inputSecureValue tL_inputSecureValue2;
        int i10;
        boolean isEmpty = TextUtils.isEmpty(str2);
        pn0 pn0Var = this.d;
        if (!isEmpty) {
            tL_inputSecureValue = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue.type = tL_secureRequiredType.type;
            tL_inputSecureValue.flags |= 1;
            cf.c k12 = pn0Var.k1(AndroidUtilities.getStringBytes(str2));
            TLRPC.TL_secureData tL_secureData = new TLRPC.TL_secureData();
            tL_inputSecureValue.data = tL_secureData;
            tL_secureData.data = (byte[]) k12.f4798c;
            tL_secureData.data_hash = (byte[]) k12.d;
            tL_secureData.secret = (byte[]) k12.f4796a;
        } else if (!TextUtils.isEmpty(str)) {
            TLRPC.SecureValueType secureValueType = this.f40474a;
            if (secureValueType instanceof TLRPC.TL_secureValueTypeEmail) {
                TLRPC.TL_securePlainEmail tL_securePlainEmail = new TLRPC.TL_securePlainEmail();
                tL_securePlainEmail.email = str;
                tL_securePlainPhone = tL_securePlainEmail;
            } else if (secureValueType instanceof TLRPC.TL_secureValueTypePhone) {
                TLRPC.TL_securePlainPhone tL_securePlainPhone2 = new TLRPC.TL_securePlainPhone();
                tL_securePlainPhone2.phone = str;
                tL_securePlainPhone = tL_securePlainPhone2;
            } else {
                return;
            }
            TLRPC.TL_inputSecureValue tL_inputSecureValue3 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue3.type = tL_secureRequiredType.type;
            tL_inputSecureValue3.flags |= 32;
            tL_inputSecureValue3.plain_data = tL_securePlainPhone;
            tL_inputSecureValue = tL_inputSecureValue3;
        } else {
            tL_inputSecureValue = null;
        }
        boolean z10 = this.f40475b;
        if (!z10 && tL_inputSecureValue == null) {
            if (aVar != null) {
                aVar.b(null, null);
                return;
            }
            return;
        }
        if (tL_secureRequiredType2 != null) {
            TLRPC.TL_inputSecureValue tL_inputSecureValue4 = new TLRPC.TL_inputSecureValue();
            tL_inputSecureValue4.type = tL_secureRequiredType2.type;
            if (!TextUtils.isEmpty(str3)) {
                tL_inputSecureValue4.flags |= 1;
                cf.c k13 = pn0Var.k1(AndroidUtilities.getStringBytes(str3));
                TLRPC.TL_secureData tL_secureData2 = new TLRPC.TL_secureData();
                tL_inputSecureValue4.data = tL_secureData2;
                tL_secureData2.data = (byte[]) k13.f4798c;
                tL_secureData2.data_hash = (byte[]) k13.d;
                tL_secureData2.secret = (byte[]) k13.f4796a;
            }
            if (secureDocument2 != null) {
                tL_inputSecureValue4.front_side = b(secureDocument2);
                tL_inputSecureValue4.flags |= 2;
            }
            if (secureDocument3 != null) {
                tL_inputSecureValue4.reverse_side = b(secureDocument3);
                tL_inputSecureValue4.flags |= 4;
            }
            if (secureDocument != null) {
                tL_inputSecureValue4.selfie = b(secureDocument);
                tL_inputSecureValue4.flags |= 8;
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputSecureValue4.flags |= 64;
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    tL_inputSecureValue4.translation.add(b((SecureDocument) arrayList2.get(i11)));
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                tL_inputSecureValue4.flags |= 16;
                int size2 = arrayList.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    tL_inputSecureValue4.files.add(b((SecureDocument) arrayList.get(i12)));
                }
            }
            if (z10) {
                tL_inputSecureValue = tL_inputSecureValue4;
            } else {
                tL_inputSecureValue2 = tL_inputSecureValue4;
                TL_account.saveSecureValue savesecurevalue = new TL_account.saveSecureValue();
                savesecurevalue.value = tL_inputSecureValue;
                savesecurevalue.secure_secret_id = pn0Var.f39553b1;
                i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue, new rm0(this, aVar, str, savesecurevalue, tL_secureRequiredType2, tL_secureRequiredType, arrayList, secureDocument, secureDocument2, secureDocument3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
            }
        }
        tL_inputSecureValue2 = null;
        TL_account.saveSecureValue savesecurevalue2 = new TL_account.saveSecureValue();
        savesecurevalue2.value = tL_inputSecureValue;
        savesecurevalue2.secure_secret_id = pn0Var.f39553b1;
        i10 = ((org.telegram.ui.ActionBar.n2) pn0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(savesecurevalue2, new rm0(this, aVar, str, savesecurevalue2, tL_secureRequiredType2, tL_secureRequiredType, arrayList, secureDocument, secureDocument2, secureDocument3, arrayList2, str2, str3, runnable, this, tL_inputSecureValue2));
    }
}
