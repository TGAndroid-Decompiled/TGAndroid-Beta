package vh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.RadialProgress2;
public final class r4 {
    public static ColorMatrixColorFilter f46145f;
    public final ImageReceiver f46146a;
    public final ImageReceiver f46147b;
    public Bitmap f46148c;
    public final RadialProgress2 d;
    public s e;

    public r4(o4 o4Var, f6 f6Var) {
        this.f46146a = new ImageReceiver(o4Var);
        this.f46147b = new ImageReceiver(o4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(o4Var, f6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String str;
        String sb;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        s sVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f46146a;
        if (sVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String h = e2.c.h(i10, "_", i10);
        StringBuilder sb2 = new StringBuilder();
        s sVar2 = this.e;
        if (sVar2 == null) {
            sb = "null";
        } else {
            if (sVar2.f46151b) {
                str = "v";
            } else if (sVar2.f46152c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.e != null) {
                StringBuilder f10 = v2.f(str, ":local:");
                f10.append(this.e.e);
                sb = f10.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f19190id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f46154g;
                        if (photo2 != null) {
                            j10 = photo2.f19208id;
                        }
                    }
                }
                StringBuilder f11 = v2.f(str, ":");
                f11.append(this.e.f46150a);
                f11.append(":");
                f11.append(j10);
                sb = f11.toString();
            }
        }
        sb2.append(sb);
        sb2.append("@");
        sb2.append(h);
        if (sb2.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        s sVar4 = this.e;
        if (sVar4.f46151b) {
            if (sVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, h, null, h, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f19209w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), "g", ImageLocation.getForDocument(photoSize, this.e.h), h, ImageLocation.getForDocument(photoSize2, this.e.h), h, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (sVar4.e != null) {
            imageReceiver.setOrientation(sVar4.f46158l, sVar4.f46159m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), h, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.e.f46154g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f46154g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f46154g), h, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f46154g), h, null, 0L, null, this.e.f46154g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f46146a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f46147b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f46148c || imageReceiver2.getBitmap() == null)) {
                this.f46148c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f46145f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f46145f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f46145f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.e;
        if (sVar != null) {
            if (sVar.e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.e;
        if (sVar != null && !sVar.f46151b && !sVar.b()) {
            int i10 = this.e.f46158l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
