package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.f8;
import org.telegram.messenger.vi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.y41;
import org.telegram.ui.q8;
public final class l6 extends View implements org.telegram.ui.ActionBar.k6 {
    public static Object I;
    public static Vector J;
    public float D;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.p6 f49187a;
    public final TextPaint f49188b;
    public final PorterDuffColorFilter f49189c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.k5 f49190f;
    public final t80 h;
    public final Path f49191n;
    public final ArrayList f49192r;
    public final ArrayList f49193s;
    public boolean f49194w;
    public boolean f49195x;
    public final Object f49196y;

    public l6(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.f49187a = p6Var;
        setMinimumWidth(org.telegram.messenger.i0.L(196.0f));
        setPadding(org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(13.0f), org.telegram.messenger.i0.L(8.0f));
        int i11 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.Cells.y a02 = org.telegram.ui.ActionBar.t6.a0(org.telegram.ui.ActionBar.t6.w0(i11, p6Var), 0, 8);
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i11);
        setBackground(a02);
        org.telegram.ui.ActionBar.a7.k(this, a02, null, N, p6Var);
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f49188b = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        int i12 = org.telegram.ui.ActionBar.t6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(i12, p6Var));
        this.f49189c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), PorterDuff.Mode.SRC_IN);
        t80 t80Var = new t80(p6Var);
        this.h = t80Var;
        t80Var.setCallback(this);
        t80Var.f(org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.05f, -1));
        Path path = new Path();
        this.f49191n = path;
        t80Var.f30593y = path;
        t80Var.k(4.0f);
        boolean[] zArr = {true};
        this.f49196y = obj;
        if (z10) {
            this.f49192r = new ArrayList();
            this.f49193s = new ArrayList();
            this.f49194w = false;
            this.f49195x = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f19864id = tL_inputPhoto;
                tL_inputPhoto.f19813id = photo.f19818id;
                tL_inputPhoto.access_hash = photo.access_hash;
                byte[] bArr = photo.file_reference;
                tL_inputPhoto.file_reference = bArr;
                if (bArr == null) {
                    tL_inputPhoto.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
            } else if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
                TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                tL_inputStickeredMediaDocument.f19863id = tL_inputDocument;
                tL_inputDocument.f19806id = document.f19800id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            q8 q8Var = new q8(this, obj, arrayList, zArr, i10, 13);
            if (I == obj && (vector = J) != null) {
                zArr[0] = false;
                q8Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new org.telegram.ui.b0(obj, i10, tL_messages_getAttachedStickers, q8Var, 7));
            return;
        }
        this.f49194w = true;
        this.f49195x = false;
        ArrayList arrayList2 = new ArrayList();
        this.f49193s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f49193s.size() == 1) {
            vi.b0(i10).l0((TLRPC.InputStickerSet) this.f49193s.get(0), 0, false, false, new k6(this, 0));
            return;
        }
        set(this.f49193s.size());
        d(false);
    }

    public static void a(l6 l6Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
        int i11;
        int size;
        if (!(tLObject instanceof Vector)) {
            return;
        }
        Vector vector = (Vector) tLObject;
        I = obj;
        J = vector;
        for (int i12 = 0; i12 < vector.objects.size(); i12++) {
            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i12);
            l6Var.f49192r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                l6Var.f49193s.add(vi.Z(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    l6Var.f49194w = true;
                } else if (!stickerSet2.masks) {
                    l6Var.f49195x = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = l6Var.f49192r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (l6Var.f49193s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j10 = inputStickerSet.f19814id;
                int i15 = 0;
                while (true) {
                    if (i15 < l6Var.f49193s.size()) {
                        if (((TLRPC.InputStickerSet) l6Var.f49193s.get(i15)).f19814id == j10) {
                            break;
                        }
                        i15++;
                    } else {
                        l6Var.f49193s.add(inputStickerSet);
                        break;
                    }
                }
            }
            l6Var.f49194w = true;
        }
        if (i13 == 1) {
            if (l6Var.f49192r.size() >= 1) {
                l6Var.set((TLRPC.StickerSetCovered) l6Var.f49192r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                vi.b0(i10).l0((TLRPC.InputStickerSet) arrayList.get(0), 0, false, false, new k6(l6Var, 1));
                return;
            } else {
                l6Var.set(0);
            }
        } else {
            l6Var.set(i13);
        }
        l6Var.d(zArr[0]);
    }

    public static void b(l6 l6Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        l6Var.set(tL_messages_stickerSet);
        l6Var.d(false);
    }

    public static void c(l6 l6Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        l6Var.set(tL_messages_stickerSet);
        l6Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String L0;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new l00(org.telegram.ui.ActionBar.t6.Uc, this.h.f30573a), 0, spannableString.length(), 33);
        spannableString.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f19800id == tL_messages_stickerSet.set.thumb_document_id) {
                document = arrayList.get(i10);
                break;
            } else {
                i10++;
            }
        }
        if (document == null && !arrayList.isEmpty()) {
            document = arrayList.get(0);
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.o5(document, this.f49188b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f49194w;
        if (z10 && this.f49195x) {
            L0 = dd.L0(2131744713, null);
        } else if (z10) {
            L0 = dd.L0(2131744718, null);
        } else {
            L0 = dd.L0(2131744710, null);
        }
        setText(org.telegram.messenger.i0.J2(L0, charSequence, "%s"));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            boolean z11 = false;
            this.H = ValueAnimator.ofFloat(this.D, 1.0f);
            if (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > org.telegram.messenger.i0.L(3.0f)) {
                z11 = true;
            }
            this.H.addUpdateListener(new jg.o0(11, this, z11));
            this.H.setInterpolator(gr.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
            return;
        }
        this.D = 1.0f;
        invalidate();
        post(new sg.v(this, 19));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.D;
        if (f7 < 1.0f) {
            t80 t80Var = this.h;
            t80Var.setAlpha((int) ((1.0f - f7) * 255.0f));
            Path path = this.f49191n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, org.telegram.messenger.i0.L(12.0f) + paddingTop2, direction);
            path.addRect(getPaddingLeft(), org.telegram.messenger.i0.L(16.0f) + getPaddingTop(), (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), org.telegram.messenger.i0.L(28.0f) + getPaddingTop(), direction);
            t80Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f10 = 0.0f;
            if (this.D > 0.0f) {
                canvas.save();
                float paddingLeft2 = getPaddingLeft();
                if (!dd.X) {
                    f10 = this.e;
                }
                canvas.translate(paddingLeft2 - f10, getPaddingTop());
                this.f49188b.setAlpha((int) (this.D * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.d, this.f49190f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.D, this.f49189c);
                canvas.restore();
            }
        }
    }

    public cv getAlert() {
        if (this.f49193s == null) {
            int i10 = -this.G;
            this.G = i10;
            org.telegram.messenger.i0.F3(i10, this, null);
            org.telegram.messenger.t2.APP_ERROR.a();
            return null;
        }
        return new cv(null, getContext(), this.f49187a, this.f49193s);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int height;
        int minimumWidth;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            z10 = true;
        } else {
            z10 = false;
        }
        int paddingTop = getPaddingTop();
        int L = org.telegram.messenger.i0.L(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = org.telegram.messenger.i0.L(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + org.telegram.messenger.i0.W1(this.D, L, height) + paddingTop;
        if (z10) {
            minimumWidth = View.MeasureSpec.getSize(i10);
        } else {
            minimumWidth = getMinimumWidth();
        }
        setMeasuredDimension(minimumWidth, paddingBottom);
        int size = (View.MeasureSpec.getSize(i10) - getPaddingLeft()) - getPaddingRight();
        if (z10) {
            CharSequence charSequence = this.F;
            if (charSequence != null || (this.d != null && this.E != size)) {
                if (charSequence == null) {
                    charSequence = this.d.getText();
                }
                setText(charSequence);
                this.F = null;
                this.E = size;
            }
        }
    }

    public void setText(CharSequence charSequence) {
        float f7;
        if (getMeasuredWidth() <= 0) {
            this.F = charSequence;
            return;
        }
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        if (measuredWidth <= 0) {
            this.F = charSequence;
            return;
        }
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f49188b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.d = staticLayout;
        if (staticLayout.getLineCount() > 0) {
            f7 = this.d.getLineLeft(0);
        } else {
            f7 = 0.0f;
        }
        this.e = f7;
        if (this.d.getLineCount() > 0) {
            this.d.getLineWidth(0);
        }
        this.f49190f = org.telegram.ui.Components.o5.update(0, this, this.f49190f, this.d);
    }

    @Override
    public final void updateColors() {
        try {
            TextPaint textPaint = this.f49188b;
            if (textPaint != null) {
                textPaint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.E8, this.f49187a));
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.h && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    private void set(TLRPC.StickerSetCovered stickerSetCovered) {
        CharSequence charSequence;
        String L0;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new l00(org.telegram.ui.ActionBar.t6.Uc, this.h.f30573a), 0, spannableString.length(), 33);
        spannableString.setSpan(new y41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f19800id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.o5(document, this.f49188b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.f49194w;
        if (z10 && this.f49195x) {
            L0 = dd.L0(2131744713, null);
        } else if (z10) {
            L0 = dd.L0(2131744718, null);
        } else {
            L0 = dd.L0(2131744710, null);
        }
        setText(org.telegram.messenger.i0.J2(L0, charSequence, "%s"));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    private void set(int i10) {
        boolean z10 = this.f49194w;
        t80 t80Var = this.h;
        if (z10 && this.f49195x) {
            setText(org.telegram.messenger.i0.R2(dd.G(i10, "StoryContainsStickersEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, t80Var.f30573a), null, null));
        } else if (z10) {
            setText(org.telegram.messenger.i0.R2(dd.G(i10, "StoryContainsEmoji", new Object[0]), 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, t80Var.f30573a), null, null));
        } else {
            setText(org.telegram.messenger.i0.R2(dd.G(i10, "StoryContainsStickers", new Object[0]), 0, org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Uc, t80Var.f30573a), null, null));
        }
    }
}
