package th;

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
    public static ColorMatrixColorFilter f48672f;
    public final ImageReceiver f48673a;
    public final ImageReceiver f48674b;
    public Bitmap f48675c;
    public final RadialProgress2 d;
    public s f48676e;

    public p4(m4 m4Var, c6 c6Var) {
        this.f48673a = new ImageReceiver(m4Var);
        this.f48674b = new ImageReceiver(m4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(m4Var, c6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String str;
        String sb2;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        s sVar = this.f48676e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f48673a;
        if (sVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k9 = com.google.android.recaptcha.internal.a.k(i10, "_", i10);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f48676e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f48713b) {
                str = "v";
            } else if (sVar2.f48714c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f48715e != null) {
                StringBuilder f9 = u3.c.f(str, ":local:");
                f9.append(this.f48676e.f48715e);
                sb2 = f9.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f48676e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f22398id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f48717g;
                        if (photo2 != null) {
                            j10 = photo2.f22416id;
                        }
                    }
                }
                StringBuilder f10 = u3.c.f(str, ":");
                f10.append(this.f48676e.f48712a);
                f10.append(":");
                f10.append(j10);
                sb2 = f10.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k9);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f48676e.getClass();
        s sVar4 = this.f48676e;
        if (sVar4.f48713b) {
            if (sVar4.f48715e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f48676e.f48715e), "g", null, k9, null, k9, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f48676e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f22417w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f48676e.h.thumbs;
                if (arrayList2 != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i13);
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForDocument(this.f48676e.h), "g", ImageLocation.getForDocument(photoSize, this.f48676e.h), k9, ImageLocation.getForDocument(photoSize2, this.f48676e.h), k9, null, 0L, null, this.f48676e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (sVar4.f48715e != null) {
            imageReceiver.setOrientation(sVar4.f48721l, sVar4.f48722m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f48676e.f48715e), k9, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f48676e.f48717g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f48676e.f48717g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f48676e.f48717g), k9, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f48676e.f48717g), k9, null, 0L, null, this.f48676e.f48717g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f48673a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f48674b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f48675c || imageReceiver2.getBitmap() == null)) {
                this.f48675c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f48672f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f48672f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f48672f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f48676e;
        if (sVar != null) {
            if (sVar.f48715e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f48676e;
        if (sVar != null && !sVar.f48713b && !sVar.b()) {
            int i10 = this.f48676e.f48721l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
