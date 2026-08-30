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
public final class k2 extends TLObject {
    public long f39559a = System.currentTimeMillis();
    public String f39560b;
    public String f39561c;
    public String d;
    public int e;
    public int f39562f;
    public Bitmap f39563i;
    public byte[] f39564j;

    public static k2 a(w0 w0Var) {
        k2 k2Var = new k2();
        String hostAuthority = AndroidUtilities.getHostAuthority(w0Var.getUrl(), true);
        k2Var.f39560b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (w0Var.G) {
            k2Var.f39561c = w0Var.H;
        }
        k2Var.d = w0Var.f39687r;
        if (w0Var.f39688s) {
            k2Var.e = w0Var.f39689w;
        }
        if (w0Var.v) {
            k2Var.f39562f = w0Var.f39690x;
        }
        if (w0Var.J) {
            k2Var.f39563i = w0Var.L;
        }
        return k2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f39559a = inputSerializedData.readInt64(z4);
        this.f39560b = inputSerializedData.readString(z4);
        this.f39561c = inputSerializedData.readString(z4);
        this.d = inputSerializedData.readString(z4);
        this.e = inputSerializedData.readInt32(z4);
        this.f39562f = inputSerializedData.readInt32(z4);
        if (inputSerializedData.readInt32(z4) == 1450380236) {
            this.f39563i = null;
            return;
        }
        this.f39564j = inputSerializedData.readByteArray(z4);
        this.f39563i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f39564j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f39559a);
        String str = this.f39560b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f39561c;
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
        outputSerializedData.writeInt32(this.f39562f);
        if (this.f39563i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f39564j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f39563i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f39563i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f39564j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
