package qh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.RadialProgress2;
public final class o4 {
    public static ColorMatrixColorFilter f46599f;
    public final ImageReceiver f46600a;
    public final ImageReceiver f46601b;
    public Bitmap f46602c;
    public final RadialProgress2 d;
    public s f46603e;

    public o4(l4 l4Var, b6 b6Var) {
        this.f46600a = new ImageReceiver(l4Var);
        this.f46601b = new ImageReceiver(l4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(l4Var, b6Var);
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
        s sVar = this.f46603e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f46600a;
        if (sVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i9 = AndroidUtilities.displaySize.x;
        String l10 = e2.c.l(i9, "_", i9);
        StringBuilder sb3 = new StringBuilder();
        s sVar2 = this.f46603e;
        if (sVar2 == null) {
            sb2 = "null";
        } else {
            if (sVar2.f46669b) {
                str = "v";
            } else if (sVar2.f46670c) {
                str = "a";
            } else {
                str = "p";
            }
            if (sVar2.f46671e != null) {
                StringBuilder e10 = ta.b.e(str, ":local:");
                e10.append(this.f46603e.f46671e);
                sb2 = e10.toString();
            } else {
                long j10 = 0;
                if (sVar2.b()) {
                    s sVar3 = this.f46603e;
                    TLRPC.Document document2 = sVar3.h;
                    if (document2 != null) {
                        j10 = document2.f22386id;
                    } else {
                        TLRPC.Photo photo2 = sVar3.f46673g;
                        if (photo2 != null) {
                            j10 = photo2.f22404id;
                        }
                    }
                }
                StringBuilder e11 = ta.b.e(str, ":");
                e11.append(this.f46603e.f46668a);
                e11.append(":");
                e11.append(j10);
                sb2 = e11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(l10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f46603e.getClass();
        s sVar4 = this.f46603e;
        if (sVar4.f46669b) {
            if (sVar4.f46671e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f46603e.f46671e), "g", null, l10, null, l10, null, 0L, null, null, 0);
            } else if (sVar4.b() && (document = this.f46603e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i10 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i11);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f22405w, photoSize4.h) - photoSize3)) < i10) {
                            photoSize = photoSize4;
                            i10 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f46603e.h.thumbs;
                if (arrayList2 != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i12) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i12);
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForDocument(this.f46603e.h), "g", ImageLocation.getForDocument(photoSize, this.f46603e.h), l10, ImageLocation.getForDocument(photoSize2, this.f46603e.h), l10, null, 0L, null, this.f46603e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (sVar4.f46671e != null) {
            imageReceiver.setOrientation(sVar4.f46677l, sVar4.f46678m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f46603e.f46671e), l10, null, null, null, 0);
        } else if (sVar4.b() && (photo = this.f46603e.f46673g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f46603e.f46673g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f46603e.f46673g), l10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f46603e.f46673g), l10, null, 0L, null, this.f46603e.f46673g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f46600a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f46601b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f46602c || imageReceiver2.getBitmap() == null)) {
                this.f46602c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f46599f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f46599f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f46599f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        s sVar = this.f46603e;
        if (sVar != null) {
            if (sVar.f46671e != null || sVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        s sVar = this.f46603e;
        if (sVar != null && !sVar.f46669b && !sVar.b()) {
            int i9 = this.f46603e.f46677l;
            if (i9 == 90 || i9 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
