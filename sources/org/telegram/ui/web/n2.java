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
public final class n2 extends TLObject {
    public long f42300a = System.currentTimeMillis();
    public String f42301b;
    public String f42302c;
    public String d;
    public int f42303e;
    public int f42304f;
    public Bitmap f42305i;
    public byte[] f42306j;

    public static n2 a(z0 z0Var) {
        n2 n2Var = new n2();
        String hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl(), true);
        n2Var.f42301b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (z0Var.J) {
            n2Var.f42302c = z0Var.K;
        }
        n2Var.d = z0Var.f42449r;
        if (z0Var.f42450s) {
            n2Var.f42303e = z0Var.f42451w;
        }
        if (z0Var.v) {
            n2Var.f42304f = z0Var.f42452x;
        }
        if (z0Var.M) {
            n2Var.f42305i = z0Var.O;
        }
        return n2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42300a = inputSerializedData.readInt64(z10);
        this.f42301b = inputSerializedData.readString(z10);
        this.f42302c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f42303e = inputSerializedData.readInt32(z10);
        this.f42304f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f42305i = null;
            return;
        }
        this.f42306j = inputSerializedData.readByteArray(z10);
        this.f42305i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f42306j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f42300a);
        String str = this.f42301b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f42302c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f42303e);
        outputSerializedData.writeInt32(this.f42304f);
        if (this.f42305i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f42306j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f42305i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f42305i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f42306j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
