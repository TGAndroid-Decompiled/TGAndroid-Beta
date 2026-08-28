package org.telegram.ui.web;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
public final class h2 extends TLObject {
    public long f43879a = System.currentTimeMillis();
    public String f43880b;
    public String f43881c;
    public String d;
    public int f43882e;
    public int f43883f;
    public Bitmap f43884i;
    public byte[] f43885j;

    public static h2 a(v0 v0Var) {
        h2 h2Var = new h2();
        String hostAuthority = AndroidUtilities.getHostAuthority(v0Var.getUrl(), true);
        h2Var.f43880b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (v0Var.F) {
            h2Var.f43881c = v0Var.G;
        }
        h2Var.d = v0Var.f44042r;
        if (v0Var.f44043s) {
            h2Var.f43882e = v0Var.f44044w;
        }
        if (v0Var.v) {
            h2Var.f43883f = v0Var.f44045x;
        }
        if (v0Var.I) {
            h2Var.f43884i = v0Var.K;
        }
        return h2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43879a = inputSerializedData.readInt64(z10);
        this.f43880b = inputSerializedData.readString(z10);
        this.f43881c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f43882e = inputSerializedData.readInt32(z10);
        this.f43883f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43884i = null;
            return;
        }
        this.f43885j = inputSerializedData.readByteArray(z10);
        this.f43884i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43885j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f43879a);
        String str = this.f43880b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f43881c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f43882e);
        outputSerializedData.writeInt32(this.f43883f);
        if (this.f43884i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43885j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f43884i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f43884i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43885j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
