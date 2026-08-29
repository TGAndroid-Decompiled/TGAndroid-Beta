package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class s3 implements tt0 {
    public final TLRPC.WebPage f42261a;
    public final List f42262b;
    public final m4 f42263c;

    public s3(m4 m4Var, TLRPC.WebPage webPage, List list) {
        this.f42263c = m4Var;
        this.f42261a = webPage;
        this.f42262b = list;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 < this.f42262b.size() && i10 >= 0 && j4.g(this.f42261a, get(i10))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.f42262b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42261a;
            if (z10) {
                TLRPC.Photo e10 = j4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e10 != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return j4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = j4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return j4.c(a2);
            }
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject d = d(i10);
        if (d instanceof TLRPC.Photo) {
            d = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) d).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(d);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 < this.f42262b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42261a;
            if (z10) {
                return j4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return j4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        if (i10 < this.f42262b.size() && i10 >= 0 && !j4.g(this.f42261a, get(i10))) {
            k4 k4Var = this.f42263c.f40404q0[0].f41514c;
            TL_iv.PageBlock pageBlock = get(i10);
            k4Var.getClass();
            if (k4.I(pageBlock) == 5) {
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
                int i10 = closestPhotoSizeWithSize2.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return closestPhotoSizeWithSize2;
            }
            iArr[0] = -1;
            return null;
        } else if ((tLObject instanceof TLRPC.Document) && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) != null) {
            int i11 = closestPhotoSizeWithSize.size;
            iArr[0] = i11;
            if (i11 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        } else {
            return null;
        }
    }

    @Override
    public final Object g() {
        return this.f42261a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f42262b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f42262b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        m4 m4Var = this.f42263c;
        int childCount = m4Var.f40404q0[0].f41513b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = m4Var.f40404q0[0].f41513b.getChildAt(i10);
            if (childAt instanceof u2) {
                u2 u2Var = (u2) childAt;
                int indexOf = u2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    u2Var.f43135a.x(indexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final java.lang.CharSequence i(int r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s3.i(int):java.lang.CharSequence");
    }

    @Override
    public final int j() {
        return this.f42262b.size();
    }
}
