package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class r3 implements vt0 {
    public final TLRPC.WebPage f42259a;
    public final List f42260b;
    public final l4 f42261c;

    public r3(l4 l4Var, TLRPC.WebPage webPage, List list) {
        this.f42261c = l4Var;
        this.f42259a = webPage;
        this.f42260b = list;
    }

    @Override
    public final boolean a(int i9) {
        if (i9 < this.f42260b.size() && i9 >= 0 && i4.g(this.f42259a, get(i9))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i9) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i9 < this.f42260b.size() && i9 >= 0) {
            TL_iv.PageBlock pageBlock = get(i9);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42259a;
            if (z10) {
                TLRPC.Photo e10 = i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return i4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return i4.c(a2);
            }
        }
        return null;
    }

    @Override
    public final String c(int i9) {
        TLObject d = d(i9);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i9) {
        if (i9 < this.f42260b.size() && i9 >= 0) {
            TL_iv.PageBlock pageBlock = get(i9);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42259a;
            if (z10) {
                return i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i9) {
        if (i9 < this.f42260b.size() && i9 >= 0 && !i4.g(this.f42259a, get(i9))) {
            j4 j4Var = this.f42261c.f40026q0[0].f41321c;
            TL_iv.PageBlock pageBlock = get(i9);
            j4Var.getClass();
            if (j4.I(pageBlock) == 5) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
            if (closestPhotoSizeWithSize2 != null) {
                int i9 = closestPhotoSizeWithSize2.size;
                iArr[0] = i9;
                if (i9 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
            iArr[0] = -1;
            return null;
        } else if ((tLObject instanceof TLRPC.Document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) != null) {
            int i10 = closestPhotoSizeWithSize.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        } else {
            return null;
        }
    }

    @Override
    public final Object g() {
        return this.f42259a;
    }

    @Override
    public final TL_iv.PageBlock get(int i9) {
        return (TL_iv.PageBlock) this.f42260b.get(i9);
    }

    @Override
    public final List getAll() {
        return this.f42260b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        l4 l4Var = this.f42261c;
        int childCount = l4Var.f40026q0[0].f41320b.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = l4Var.f40026q0[0].f41320b.getChildAt(i9);
            if (childAt instanceof t2) {
                t2 t2Var = (t2) childAt;
                int indexOf = t2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    t2Var.f42811a.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r3.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.f42260b.size();
    }
}
