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
public final class s4 {
    public static ColorMatrixColorFilter f46242f;
    public final ImageReceiver f46243a;
    public final ImageReceiver f46244b;
    public Bitmap f46245c;
    public final RadialProgress2 d;
    public t e;

    public s4(p4 p4Var, f6 f6Var) {
        this.f46243a = new ImageReceiver(p4Var);
        this.f46244b = new ImageReceiver(p4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(p4Var, f6Var);
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
        t tVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f46243a;
        if (tVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String h = e2.c.h(i10, "_", i10);
        StringBuilder sb2 = new StringBuilder();
        t tVar2 = this.e;
        if (tVar2 == null) {
            sb = "null";
        } else {
            if (tVar2.f46248b) {
                str = "v";
            } else if (tVar2.f46249c) {
                str = "a";
            } else {
                str = "p";
            }
            if (tVar2.e != null) {
                StringBuilder f10 = w2.f(str, ":local:");
                f10.append(this.e.e);
                sb = f10.toString();
            } else {
                long j10 = 0;
                if (tVar2.b()) {
                    t tVar3 = this.e;
                    TLRPC.Document document2 = tVar3.h;
                    if (document2 != null) {
                        j10 = document2.f19165id;
                    } else {
                        TLRPC.Photo photo2 = tVar3.f46251g;
                        if (photo2 != null) {
                            j10 = photo2.f19183id;
                        }
                    }
                }
                StringBuilder f11 = w2.f(str, ":");
                f11.append(this.e.f46247a);
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
        t tVar4 = this.e;
        if (tVar4.f46248b) {
            if (tVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, h, null, h, null, 0L, null, null, 0);
            } else if (tVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f19184w, photoSize4.h) - photoSize3)) < i11) {
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
        } else if (tVar4.e != null) {
            imageReceiver.setOrientation(tVar4.f46255l, tVar4.f46256m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), h, null, null, null, 0);
        } else if (tVar4.b() && (photo = this.e.f46251g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f46251g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f46251g), h, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f46251g), h, null, 0L, null, this.e.f46251g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f46243a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f46244b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f46245c || imageReceiver2.getBitmap() == null)) {
                this.f46245c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f46242f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f46242f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f46242f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        t tVar = this.e;
        if (tVar != null) {
            if (tVar.e != null || tVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        t tVar = this.e;
        if (tVar != null && !tVar.f46248b && !tVar.b()) {
            int i10 = this.e.f46255l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
