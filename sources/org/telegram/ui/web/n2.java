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
    public long f42288a = System.currentTimeMillis();
    public String f42289b;
    public String f42290c;
    public String d;
    public int f42291e;
    public int f42292f;
    public Bitmap f42293i;
    public byte[] f42294j;

    public static n2 a(z0 z0Var) {
        n2 n2Var = new n2();
        String hostAuthority = AndroidUtilities.getHostAuthority(z0Var.getUrl(), true);
        n2Var.f42289b = hostAuthority;
        if (TextUtils.isEmpty(hostAuthority)) {
            return null;
        }
        if (z0Var.J) {
            n2Var.f42290c = z0Var.K;
        }
        n2Var.d = z0Var.f42437r;
        if (z0Var.f42438s) {
            n2Var.f42291e = z0Var.f42439w;
        }
        if (z0Var.v) {
            n2Var.f42292f = z0Var.f42440x;
        }
        if (z0Var.M) {
            n2Var.f42293i = z0Var.O;
        }
        return n2Var;
    }

    @Override
    public final void readParams(InputSerializedData inputSerializedData, boolean z10) {
        this.f42288a = inputSerializedData.readInt64(z10);
        this.f42289b = inputSerializedData.readString(z10);
        this.f42290c = inputSerializedData.readString(z10);
        this.d = inputSerializedData.readString(z10);
        this.f42291e = inputSerializedData.readInt32(z10);
        this.f42292f = inputSerializedData.readInt32(z10);
        if (inputSerializedData.readInt32(z10) == 1450380236) {
            this.f42293i = null;
            return;
        }
        this.f42294j = inputSerializedData.readByteArray(z10);
        this.f42293i = BitmapFactory.decodeStream(new ByteArrayInputStream(this.f42294j));
    }

    @Override
    public final void serializeToStream(OutputSerializedData outputSerializedData) {
        Bitmap.CompressFormat compressFormat;
        outputSerializedData.writeInt64(this.f42288a);
        String str = this.f42289b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        outputSerializedData.writeString(str);
        String str3 = this.f42290c;
        if (str3 == null) {
            str3 = "";
        }
        outputSerializedData.writeString(str3);
        String str4 = this.d;
        if (str4 != null) {
            str2 = str4;
        }
        outputSerializedData.writeString(str2);
        outputSerializedData.writeInt32(this.f42291e);
        outputSerializedData.writeInt32(this.f42292f);
        if (this.f42293i == null) {
            outputSerializedData.writeInt32(1450380236);
            return;
        }
        outputSerializedData.writeInt32(953850003);
        byte[] bArr = this.f42294j;
        if (bArr != null) {
            outputSerializedData.writeByteArray(bArr);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (Build.VERSION.SDK_INT >= 30) {
            Bitmap bitmap = this.f42293i;
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            bitmap.compress(compressFormat, 80, byteArrayOutputStream);
        } else {
            this.f42293i.compress(Bitmap.CompressFormat.WEBP, 80, byteArrayOutputStream);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this.f42294j = byteArray;
        outputSerializedData.writeByteArray(byteArray);
        try {
            byteArrayOutputStream.close();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
