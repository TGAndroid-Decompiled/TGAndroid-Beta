package wh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.RadialProgress2;
public final class r4 {
    public static ColorMatrixColorFilter f50049f;
    public final ImageReceiver f50050a;
    public final ImageReceiver f50051b;
    public Bitmap f50052c;
    public final RadialProgress2 d;
    public t f50053e;

    public r4(o4 o4Var, g6 g6Var) {
        this.f50050a = new ImageReceiver(o4Var);
        this.f50051b = new ImageReceiver(o4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(o4Var, g6Var);
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
        t tVar = this.f50053e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f50050a;
        if (tVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String h = e2.c.h(i10, "_", i10);
        StringBuilder sb2 = new StringBuilder();
        t tVar2 = this.f50053e;
        if (tVar2 == null) {
            sb = "null";
        } else {
            if (tVar2.f50067b) {
                str = "v";
            } else if (tVar2.f50068c) {
                str = "a";
            } else {
                str = "p";
            }
            if (tVar2.f50069e != null) {
                StringBuilder f10 = w.c.f(str, ":local:");
                f10.append(this.f50053e.f50069e);
                sb = f10.toString();
            } else {
                long j10 = 0;
                if (tVar2.b()) {
                    t tVar3 = this.f50053e;
                    TLRPC.Document document2 = tVar3.h;
                    if (document2 != null) {
                        j10 = document2.f20851id;
                    } else {
                        TLRPC.Photo photo2 = tVar3.f50071g;
                        if (photo2 != null) {
                            j10 = photo2.f20869id;
                        }
                    }
                }
                StringBuilder f11 = w.c.f(str, ":");
                f11.append(this.f50053e.f50066a);
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
        this.f50053e.getClass();
        t tVar4 = this.f50053e;
        if (tVar4.f50067b) {
            if (tVar4.f50069e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f50053e.f50069e), "g", null, h, null, h, null, 0L, null, null, 0);
            } else if (tVar4.b() && (document = this.f50053e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f20870w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f50053e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.f50053e.h), "g", ImageLocation.getForDocument(photoSize, this.f50053e.h), h, ImageLocation.getForDocument(photoSize2, this.f50053e.h), h, null, 0L, null, this.f50053e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (tVar4.f50069e != null) {
            imageReceiver.setOrientation(tVar4.f50075l, tVar4.f50076m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f50053e.f50069e), h, null, null, null, 0);
        } else if (tVar4.b() && (photo = this.f50053e.f50071g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f50053e.f50071g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f50053e.f50071g), h, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f50053e.f50071g), h, null, 0L, null, this.f50053e.f50071g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f50050a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f50051b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f50052c || imageReceiver2.getBitmap() == null)) {
                this.f50052c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f50049f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f50049f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f50049f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        t tVar = this.f50053e;
        if (tVar != null) {
            if (tVar.f50069e != null || tVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        t tVar = this.f50053e;
        if (tVar != null && !tVar.f50067b && !tVar.b()) {
            int i10 = this.f50053e.f50075l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
