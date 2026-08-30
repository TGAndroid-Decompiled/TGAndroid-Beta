package org.telegram.ui;

import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class r3 implements du0 {
    public final TLRPC.WebPage f37910a;
    public final List f37911b;
    public final l4 f37912c;

    public r3(l4 l4Var, TLRPC.WebPage webPage, List list) {
        this.f37912c = l4Var;
        this.f37910a = webPage;
        this.f37911b = list;
    }

    @Override
    public final boolean a(int i10) {
        if (i10 < this.f37911b.size() && i10 >= 0 && i4.g(this.f37910a, get(i10))) {
            return true;
        }
        return false;
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document a2;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.f37911b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f37910a;
            if (z4) {
                TLRPC.Photo e = i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (e != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return i4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (a2 = i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return i4.c(a2);
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
        if (i10 < this.f37911b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z4 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f37910a;
            if (z4) {
                return i4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
            }
            if (pageBlock instanceof TL_iv.pageBlockVideo) {
                return i4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
            }
        }
        return null;
    }

    @Override
    public final boolean e(int i10) {
        if (i10 < this.f37911b.size() && i10 >= 0 && !i4.g(this.f37910a, get(i10))) {
            j4 j4Var = this.f37912c.f35945r0[0].f37160c;
            TL_iv.PageBlock pageBlock = get(i10);
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
        return this.f37910a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f37911b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f37911b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        l4 l4Var = this.f37912c;
        int childCount = l4Var.f35945r0[0].f37159b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = l4Var.f35945r0[0].f37159b.getChildAt(i10);
            if (childAt instanceof s2) {
                s2 s2Var = (s2) childAt;
                int indexOf = s2Var.d.items.indexOf(pageBlock);
                if (indexOf != -1) {
                    s2Var.f38172a.x(indexOf, false);
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
        return this.f37911b.size();
    }
}
