package org.telegram.ui;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class s3 implements wt0 {

    public final TLRPC.WebPage f42398a;

    public final List f42399b;

    public final m4 f42400c;

    public s3(m4 m4Var, TLRPC.WebPage webPage, List list) {
        this.f42400c = m4Var;
        this.f42398a = webPage;
        this.f42399b = list;
    }

    @Override
    public final boolean a(int i10) {
        return i10 < this.f42399b.size() && i10 >= 0 && j4.g(this.f42398a, get(i10));
    }

    @Override
    public final File b(int i10) {
        TLRPC.Document documentA;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        if (i10 < this.f42399b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42398a;
            if (z10) {
                TLRPC.Photo photoE = j4.e(webPage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                if (photoE != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, AndroidUtilities.getPhotoSize())) != null) {
                    return j4.c(closestPhotoSizeWithSize);
                }
            } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (documentA = j4.a(webPage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                return j4.c(documentA);
            }
        }
        return null;
    }

    @Override
    public final String c(int i10) {
        TLObject tLObjectD = d(i10);
        if (tLObjectD instanceof TLRPC.Photo) {
            tLObjectD = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObjectD).sizes, AndroidUtilities.getPhotoSize());
        }
        return FileLoader.getAttachFileName(tLObjectD);
    }

    @Override
    public final TLObject d(int i10) {
        if (i10 < this.f42399b.size() && i10 >= 0) {
            TL_iv.PageBlock pageBlock = get(i10);
            boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
            TLRPC.WebPage webPage = this.f42398a;
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
        if (i10 < this.f42399b.size() && i10 >= 0 && !j4.g(this.f42398a, get(i10))) {
            k4 k4Var = this.f42400c.f40347q0[0].f41497c;
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
        if (!(tLObject instanceof TLRPC.Photo)) {
            if (!(tLObject instanceof TLRPC.Document) || (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Document) tLObject).thumbs, 90)) == null) {
                return null;
            }
            int i10 = closestPhotoSizeWithSize.size;
            iArr[0] = i10;
            if (i10 == 0) {
                iArr[0] = -1;
            }
            return closestPhotoSizeWithSize;
        }
        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(((TLRPC.Photo) tLObject).sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize2 == null) {
            iArr[0] = -1;
            return null;
        }
        int i11 = closestPhotoSizeWithSize2.size;
        iArr[0] = i11;
        if (i11 == 0) {
            iArr[0] = -1;
        }
        return closestPhotoSizeWithSize2;
    }

    @Override
    public final Object g() {
        return this.f42398a;
    }

    @Override
    public final TL_iv.PageBlock get(int i10) {
        return (TL_iv.PageBlock) this.f42399b.get(i10);
    }

    @Override
    public final List getAll() {
        return this.f42399b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        m4 m4Var = this.f42400c;
        int childCount = m4Var.f40347q0[0].f41496b.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = m4Var.f40347q0[0].f41496b.getChildAt(i10);
            if (childAt instanceof u2) {
                u2 u2Var = (u2) childAt;
                int iIndexOf = u2Var.d.items.indexOf(pageBlock);
                if (iIndexOf != -1) {
                    u2Var.f43068a.x(iIndexOf, false);
                    return;
                }
            }
        }
    }

    @Override
    public final CharSequence i(int i10) {
        SpannableStringBuilder spannableStringBuilder;
        TL_iv.PageBlock pageBlock = get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            String str = ((TL_iv.pageBlockPhoto) pageBlock).url;
            if (TextUtils.isEmpty(str)) {
                spannableStringBuilder = null;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new r3(this, str, 0), 0, str.length(), 34);
            }
        } else {
            spannableStringBuilder = null;
        }
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        m4 m4Var = this.f42400c;
        m4Var.getClass();
        TL_iv.RichText richTextW = m4.w(2, pageBlock);
        CharSequence charSequenceC = m4.C(m4Var, this.f42398a, null, richTextW, richTextW, pageBlock, -AndroidUtilities.dp(100.0f));
        if (!(charSequenceC instanceof Spannable)) {
            return charSequenceC;
        }
        Spannable spannable = (Spannable) charSequenceC;
        org.telegram.ui.Components.tz0[] tz0VarArr = (org.telegram.ui.Components.tz0[]) spannable.getSpans(0, charSequenceC.length(), org.telegram.ui.Components.tz0.class);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequenceC.toString());
        if (tz0VarArr != null && tz0VarArr.length > 0) {
            for (int i11 = 0; i11 < tz0VarArr.length; i11++) {
                spannableStringBuilder2.setSpan(new r3(this, tz0VarArr[i11].f32927b, 1), spannable.getSpanStart(tz0VarArr[i11]), spannable.getSpanEnd(tz0VarArr[i11]), 33);
            }
        }
        return spannableStringBuilder2;
    }

    @Override
    public final int j() {
        return this.f42399b.size();
    }
}
