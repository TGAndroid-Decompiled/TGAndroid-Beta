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

public final class i2 extends TLObject {

    public long f43866a = System.currentTimeMillis();

    public String f43867b;

    public String f43868c;
    public String d;

    public int f43869e;

    public int f43870f;

    public Bitmap f43871i;

    public byte[] f43872j;

    public static i2 a(w0 w0Var) {
        i2 i2Var = new i2();
        String hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl(), true);
        i2Var.f43867b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (w0Var.F) {
            i2Var.f43868c = w0Var.G;
        }
        i2Var.d = w0Var.f44029r;
        if (w0Var.f44030s) {
            i2Var.f43869e = w0Var.f44031w;
        }
        if (w0Var.v) {
            i2Var.f43870f = w0Var.f44032x;
        }
        if (w0Var.I) {
            i2Var.f43871i = w0Var.K;
        }
        return i2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43866a = inputSerializedData.readInt64(z10);
        this.f43867b = inputSerializedData.readString(z10);
        this.f43868c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f43869e = inputSerializedData.readInt32(z10);
        this.f43870f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43871i = null;
        } else {
            this.f43872j = inputSerializedData.readByteArray(z10);
            this.f43871i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43872j));
        }
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        outputSerializedData.writeInt64(this.f43866a);
        String str = this.f43867b;
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str2 = this.f43868c;
        if (str2 == null) {
            str2 = "";
        }
        outputSerializedData.writeString(str2);
        String str3 = this.d;
        outputSerializedData.writeString(str3 != null ? str3 : "");
        outputSerializedData.writeInt32(this.f43869e);
        outputSerializedData.writeInt32(this.f43870f);
        if (this.f43871i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43872j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            this.f43871i.compress(Bitmap.CompressFormat.WEBP_LOSSY, 80, byteArrayOutputStream);
        } else {
            this.f43871i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43872j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }
}
