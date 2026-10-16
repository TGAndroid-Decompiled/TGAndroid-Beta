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
    public long f41121a = System.currentTimeMillis();
    public String f41122b;
    public String f41123c;
    public String d;
    public int e;
    public int f41124f;
    public Bitmap f41125i;
    public byte[] f41126j;

    public static m2 a(z0 z0Var) {
        m2 m2Var = new m2();
        String hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl(), true);
        m2Var.f41122b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (z0Var.J) {
            m2Var.f41123c = z0Var.K;
        }
        m2Var.d = z0Var.f41266r;
        if (z0Var.f41267s) {
            m2Var.e = z0Var.f41268w;
        }
        if (z0Var.v) {
            m2Var.f41124f = z0Var.f41269x;
        }
        if (z0Var.M) {
            m2Var.f41125i = z0Var.O;
        }
        return m2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f41121a = inputSerializedData.readInt64(z10);
        this.f41122b = inputSerializedData.readString(z10);
        this.f41123c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f41124f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f41125i = null;
            return;
        }
        this.f41126j = inputSerializedData.readByteArray(z10);
        this.f41125i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f41126j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f41121a);
        String str = this.f41122b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f41123c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.e);
        outputSerializedData.writeInt32(this.f41124f);
        if (this.f41125i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f41126j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f41125i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f41125i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f41126j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
