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
public final class l2 extends TLObject {
    public long f43329a = System.currentTimeMillis();
    public String f43330b;
    public String f43331c;
    public String d;
    public int f43332e;
    public int f43333f;
    public Bitmap f43334i;
    public byte[] f43335j;

    public static l2 a(y0 y0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        l2Var.f43330b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            l2Var.f43331c = y0Var.K;
        }
        l2Var.d = y0Var.f43485r;
        if (y0Var.f43486s) {
            l2Var.f43332e = y0Var.f43487w;
        }
        if (y0Var.v) {
            l2Var.f43333f = y0Var.f43488x;
        }
        if (y0Var.M) {
            l2Var.f43334i = y0Var.O;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f43329a = inputSerializedData.readInt64(z10);
        this.f43330b = inputSerializedData.readString(z10);
        this.f43331c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f43332e = inputSerializedData.readInt32(z10);
        this.f43333f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f43334i = null;
            return;
        }
        this.f43335j = inputSerializedData.readByteArray(z10);
        this.f43334i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f43335j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f43329a);
        String str = this.f43330b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f43331c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f43332e);
        outputSerializedData.writeInt32(this.f43333f);
        if (this.f43334i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f43335j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f43334i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f43334i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f43335j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
