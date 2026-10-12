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
    public long f41423a = System.currentTimeMillis();
    public String f41424b;
    public String f41425c;
    public String d;
    public int e;
    public int f41426f;
    public Bitmap f41427i;
    public byte[] f41428j;

    public static l2 a(y0 y0Var) {
        l2 l2Var = new l2();
        String hostAuthority = AndroidUtilities.getHostAuthority(y0Var.getUrl(), true);
        l2Var.f41424b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (y0Var.J) {
            l2Var.f41425c = y0Var.K;
        }
        l2Var.d = y0Var.f41565r;
        if (y0Var.f41566s) {
            l2Var.e = y0Var.f41567w;
        }
        if (y0Var.v) {
            l2Var.f41426f = y0Var.f41568x;
        }
        if (y0Var.M) {
            l2Var.f41427i = y0Var.O;
        }
        return l2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f41423a = inputSerializedData.readInt64(z10);
        this.f41424b = inputSerializedData.readString(z10);
        this.f41425c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.e = inputSerializedData.readInt32(z10);
        this.f41426f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f41427i = null;
            return;
        }
        this.f41428j = inputSerializedData.readByteArray(z10);
        this.f41427i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f41428j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f41423a);
        String str = this.f41424b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f41425c;
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
        outputSerializedData.writeInt32(this.f41426f);
        if (this.f41427i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f41428j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f41427i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f41427i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f41428j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
