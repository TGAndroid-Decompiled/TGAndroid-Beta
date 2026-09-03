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
    public long f39517a = System.currentTimeMillis();
    public String f39518b;
    public String f39519c;
    public String d;
    public int e;
    public int f39520f;
    public Bitmap f39521i;
    public byte[] f39522j;

    public static l2 a(y0 y0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        l2Var.f39518b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.G) {
            l2Var.f39519c = y0Var.H;
        }
        l2Var.d = y0Var.f39656r;
        if (y0Var.f39657s) {
            l2Var.e = y0Var.f39658w;
        }
        if (y0Var.v) {
            l2Var.f39520f = y0Var.f39659x;
        }
        if (y0Var.J) {
            l2Var.f39521i = y0Var.L;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z4) {
        this.f39517a = inputSerializedData.readInt64(z4);
        this.f39518b = inputSerializedData.readString(z4);
        this.f39519c = inputSerializedData.readString(z4);
        this.d = inputSerializedData.readString(z4);
        this.e = inputSerializedData.readInt32(z4);
        this.f39520f = inputSerializedData.readInt32(z4);
        if (inputSerializedData.readInt32(z4) == 1450380236) {
            this.f39521i = null;
            return;
        }
        this.f39522j = inputSerializedData.readByteArray(z4);
        this.f39521i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f39522j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f39517a);
        String str = this.f39518b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f39519c;
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
        outputSerializedData.writeInt32(this.f39520f);
        if (this.f39521i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f39522j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f39521i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f39521i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f39522j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
