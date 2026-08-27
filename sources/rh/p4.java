package rh;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.RadialProgress2;

public final class p4 {

    public static ColorMatrixColorFilter f47374f;

    public final ImageReceiver f47375a;

    public final ImageReceiver f47376b;

    public Bitmap f47377c;
    public final RadialProgress2 d;

    public s f47378e;

    public p4(m4 m4Var, c6 c6Var) {
        this.f47375a = new ImageReceiver(m4Var);
        this.f47376b = new ImageReceiver(m4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(m4Var, c6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String string;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int iAbs;
        s sVar = this.f47378e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f47375a;
        if (sVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String strL = com.google.android.recaptcha.internal.a.l(i10, "_", i10);
        StringBuilder sb2 = new StringBuilder();
        s sVar2 = this.f47378e;
        if (sVar2 == null) {
            string = "null";
        } else {
            String str = sVar2.f47415b ? "v" : sVar2.f47416c ? "a" : "p";
            if (sVar2.f47417e != null) {
                StringBuilder sbF = s3.c.f(str, ":local:");
                sbF.append(this.f47378e.f47417e);
                string = sbF.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f47378e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f22386id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f47419g;
                        if (photo2 != null) {
                            j10 = photo2.f22404id;
                        }
                    }
                }
                StringBuilder sbF2 = s3.c.f(str, ":");
                sbF2.append(this.f47378e.f47414a);
                sbF2.append(":");
                sbF2.append(j10);
                string = sbF2.toString();
            }
        }
        sb2.append(string);
        sb2.append("@");
        sb2.append(strL);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.f47378e.getClass();
        s sVar4 = this.f47378e;
        if (!sVar4.f47415b) {
            if (sVar4.f47417e != null) {
                imageReceiver.setOrientation(sVar4.f47423l, sVar4.f47424m, true);
                imageReceiver.setImage(ImageLocation.getForPath(this.f47378e.f47417e), strL, null, null, null, 0);
                return;
            } else {
                if (!sVar4.b() || (photo = this.f47378e.f47419g) == null) {
                    imageReceiver.setImageBitmap((Drawable) null);
                    return;
                }
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f47378e.f47419g.sizes, 100);
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f47378e.f47419g), strL, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f47378e.f47419g), strL, null, 0L, null, this.f47378e.f47419g, 0);
                return;
            }
        }
        if (sVar4.f47417e != null) {
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForVideoPath(this.f47378e.f47417e), "g", null, strL, null, strL, null, 0L, null, null, 0);
            return;
        }
        if (!sVar4.b() || (document = this.f47378e.h) == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
        int photoSize3 = AndroidUtilities.getPhotoSize();
        if (arrayList == null) {
            photoSize = null;
        } else {
            int i11 = Integer.MAX_VALUE;
            photoSize = null;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (iAbs = Math.abs(Math.max(photoSize4.f22405w, photoSize4.h) - photoSize3)) < i11) {
                    photoSize = photoSize4;
                    i11 = iAbs;
                }
            }
        }
        ArrayList<TLRPC.PhotoSize> arrayList2 = this.f47378e.h.thumbs;
        if (arrayList2 != null) {
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                    photoSize2 = arrayList2.get(i13);
                    break;
                }
            }
        }
        imageReceiver.setOrientation(0, 0, false);
        imageReceiver.setImage(ImageLocation.getForDocument(this.f47378e.h), "g", ImageLocation.getForDocument(photoSize, this.f47378e.h), strL, ImageLocation.getForDocument(photoSize2, this.f47378e.h), strL, null, 0L, null, this.f47378e.h, 0);
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f47375a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f47376b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f47377c || imageReceiver2.getBitmap() == null)) {
                this.f47377c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f47374f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f47374f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f47374f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f47378e;
        if (sVar != null) {
            return sVar.f47417e != null || sVar.b();
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f47378e;
        if (sVar == null || sVar.f47415b || sVar.b()) {
            return false;
        }
        int i10 = this.f47378e.f47423l;
        return i10 == 90 || i10 == 270;
    }
}
