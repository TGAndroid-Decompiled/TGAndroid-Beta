package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class rl implements rq0 {
    public final TL_iv.RichMessage f51637a;
    public final ArrayList f51638b;
    public final org.telegram.messenger.fj f51639c;

    public rl(TL_iv.RichMessage richMessage, ArrayList arrayList, org.telegram.messenger.fj fjVar) {
        this.f51637a = richMessage;
        this.f51638b = arrayList;
        this.f51639c = fjVar;
    }

    @Override
    public final boolean a(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51638b;
            if (i7 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    TLRPC.Document b10 = d4.b(this.f51637a, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                    if (b10 != null) {
                        return org.telegram.messenger.fj.K4(b10);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final File b(int i7) {
        TLRPC.Document b10;
        TLRPC.PhotoSize w10;
        if (i7 >= 0) {
            ArrayList arrayList = this.f51638b;
            if (i7 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f51637a;
                if (z10) {
                    TLRPC.Photo f10 = d4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                    if (f10 != null && (w10 = org.telegram.messenger.w7.w(f10.sizes, org.telegram.messenger.g0.Z0(false), false, null, false)) != null) {
                        return d4.c(w10);
                    }
                } else if ((pageBlock instanceof TL_iv.pageBlockVideo) && (b10 = d4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id)) != null) {
                    return d4.c(b10);
                }
            }
        }
        return null;
    }

    @Override
    public final String c(int i7) {
        TLObject d = d(i7);
        if (d instanceof TLRPC.Photo) {
            d = org.telegram.messenger.w7.w(((TLRPC.Photo) d).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        }
        return org.telegram.messenger.w7.r(null, d);
    }

    @Override
    public final TLObject d(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.f51638b;
            if (i7 < arrayList.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) arrayList.get(i7);
                boolean z10 = pageBlock instanceof TL_iv.pageBlockPhoto;
                TL_iv.RichMessage richMessage = this.f51637a;
                if (z10) {
                    return d4.f(richMessage, ((TL_iv.pageBlockPhoto) pageBlock).photo_id);
                }
                if (pageBlock instanceof TL_iv.pageBlockVideo) {
                    return d4.b(richMessage, ((TL_iv.pageBlockVideo) pageBlock).video_id);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final boolean e(int i7) {
        return false;
    }

    @Override
    public final TLRPC.PhotoSize f(TLObject tLObject, int[] iArr) {
        if (tLObject instanceof TLRPC.Photo) {
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(((TLRPC.Photo) tLObject).sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
            if (w10 != null) {
                int i7 = w10.size;
                iArr[0] = i7;
                if (i7 == 0) {
                    iArr[0] = -1;
                }
                return w10;
            }
            iArr[0] = -1;
            return null;
        }
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(document.thumbs, 320, false, null, true);
            if (w11 == null) {
                w11 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            }
            if (w11 != null) {
                int i10 = w11.size;
                iArr[0] = i10;
                if (i10 == 0) {
                    iArr[0] = -1;
                }
                return w11;
            }
            iArr[0] = -1;
        }
        return null;
    }

    @Override
    public final Object g() {
        org.telegram.messenger.fj fjVar = this.f51639c;
        if (fjVar != null) {
            return fjVar;
        }
        return this.f51637a;
    }

    @Override
    public final TL_iv.PageBlock get(int i7) {
        return (TL_iv.PageBlock) this.f51638b.get(i7);
    }

    @Override
    public final List getAll() {
        return this.f51638b;
    }

    @Override
    public final void h(TL_iv.PageBlock pageBlock) {
        org.telegram.messenger.ev evVar;
        org.telegram.messenger.fj fjVar = this.f51639c;
        if (fjVar != null && (evVar = fjVar.f24025y2) != null) {
            ArrayList arrayList = evVar.f23775g;
            if (pageBlock != null) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    org.telegram.messenger.zt ztVar = (org.telegram.messenger.zt) arrayList.get(i7);
                    if (ztVar instanceof org.telegram.messenger.qu) {
                        org.telegram.messenger.qu quVar = (org.telegram.messenger.qu) ztVar;
                        ArrayList arrayList2 = quVar.Y;
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (((org.telegram.messenger.st) arrayList2.get(i10)).f26851b == pageBlock) {
                                int max = Math.max(0, Math.min(i10, arrayList2.size() - 1));
                                ValueAnimator valueAnimator = quVar.f26467l0;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    quVar.f26467l0 = null;
                                }
                                if (quVar.f26457b0 != max || quVar.f26458c0 != 0.0f) {
                                    quVar.f26457b0 = max;
                                    quVar.f26458c0 = 0.0f;
                                    quVar.f26459d0 = false;
                                    quVar.f26460e0 = false;
                                    View view = quVar.W;
                                    if (view != null) {
                                        view.invalidate();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        continue;
                    }
                }
            }
        }
    }

    @Override
    public final CharSequence i(int i7) {
        return null;
    }

    @Override
    public final int j() {
        return this.f51638b.size();
    }
}
