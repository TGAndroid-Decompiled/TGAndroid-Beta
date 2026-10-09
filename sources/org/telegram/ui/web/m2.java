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
public final class m2 extends TLObject {
    public long f43395a = System.currentTimeMillis();
    public String f43396b;
    public String f43397c;
    public String d;
    public int f43398e;
    public int f43399f;
    public Bitmap f43400i;
    public byte[] f43401j;

    public static m2 a(y0 y0Var) {
        m2 m2Var = new m2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        m2Var.f43396b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            m2Var.f43397c = y0Var.K;
        }
        m2Var.d = y0Var.f43543r;
        if (y0Var.f43544s) {
            m2Var.f43398e = y0Var.f43545w;
        }
        if (y0Var.v) {
            m2Var.f43399f = y0Var.f43546x;
        }
        if (y0Var.M) {
            m2Var.f43400i = y0Var.O;
        }
        return m2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43395a = inputSerializedData.readInt64(z10);
        this.f43396b = inputSerializedData.readString(z10);
        this.f43397c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f43398e = inputSerializedData.readInt32(z10);
        this.f43399f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43400i = null;
            return;
        }
        this.f43401j = inputSerializedData.readByteArray(z10);
        this.f43400i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43401j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f43395a);
        String str = this.f43396b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f43397c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f43398e);
        outputSerializedData.writeInt32(this.f43399f);
        if (this.f43400i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43401j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f43400i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f43400i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43401j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
