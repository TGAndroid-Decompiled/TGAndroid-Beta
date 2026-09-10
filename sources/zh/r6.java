package zh;

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
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.wv;
public final class r6 extends View {
    public static Object I;
    public static Vector J;
    public int E;
    public CharSequence F;
    public int G;
    public ValueAnimator H;
    public final org.telegram.ui.ActionBar.f6 f48831a;
    public final TextPaint f48832b;
    public final PorterDuffColorFilter f48833c;
    public StaticLayout d;
    public float e;
    public org.telegram.ui.Components.u5 f48834f;
    public final q90 h;
    public final Path f48835n;
    public final ArrayList f48836r;
    public final ArrayList f48837s;
    public boolean v;
    public boolean f48838w;
    public final Object f48839x;
    public float f48840y;

    public r6(Context context, int i10, TLObject tLObject, Object obj, boolean z10, ArrayList arrayList, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        Vector vector;
        this.G = -12;
        this.f48831a = f6Var;
        setMinimumWidth(AndroidUtilities.dp(196.0f));
        setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        setBackground(org.telegram.ui.ActionBar.j6.Y(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18017i6, f6Var), 0, 8));
        setClickable(true);
        TextPaint textPaint = new TextPaint(1);
        this.f48832b = textPaint;
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        int i11 = org.telegram.ui.ActionBar.j6.E8;
        textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        this.f48833c = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.SRC_IN);
        q90 q90Var = new q90(f6Var);
        this.h = q90Var;
        q90Var.setCallback(this);
        q90Var.e(org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.05f, -1));
        Path path = new Path();
        this.f48835n = path;
        q90Var.f26364x = path;
        q90Var.j(4.0f);
        boolean[] zArr = {true};
        this.f48839x = obj;
        if (z10) {
            this.f48836r = new ArrayList();
            this.f48837s = new ArrayList();
            this.v = false;
            this.f48838w = false;
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
                TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                tL_inputStickeredMediaPhoto.f17265id = tL_inputPhoto;
                tL_inputPhoto.f17214id = photo.f17219id;
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
                tL_inputStickeredMediaDocument.f17264id = tL_inputDocument;
                tL_inputDocument.f17207id = document.f17201id;
                tL_inputDocument.access_hash = document.access_hash;
                byte[] bArr2 = document.file_reference;
                tL_inputDocument.file_reference = bArr2;
                if (bArr2 == null) {
                    tL_inputDocument.file_reference = new byte[0];
                }
                tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
            }
            fg.e1 e1Var = new fg.e1(this, obj, arrayList, zArr, i10);
            if (I == obj && (vector = J) != null) {
                zArr[0] = false;
                e1Var.run(vector, null);
                return;
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getAttachedStickers, new di.c5(obj, i10, tL_messages_getAttachedStickers, e1Var, 8));
            return;
        }
        this.v = true;
        this.f48838w = false;
        ArrayList arrayList2 = new ArrayList();
        this.f48837s = arrayList2;
        arrayList2.addAll(arrayList);
        if (this.f48837s.size() == 1) {
            MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) this.f48837s.get(0), 0, false, new q6(this, 0));
            return;
        }
        set(this.f48837s.size());
        d(false);
    }

    public static void a(r6 r6Var, TLObject tLObject, Object obj, ArrayList arrayList, boolean[] zArr, int i10) {
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
            r6Var.f48836r.add(stickerSetCovered);
            TLRPC.StickerSet stickerSet = stickerSetCovered.set;
            if (stickerSet != null) {
                r6Var.f48837s.add(MediaDataController.getInputStickerSet(stickerSet));
                TLRPC.StickerSet stickerSet2 = stickerSetCovered.set;
                if (stickerSet2.emojis) {
                    r6Var.v = true;
                } else if (!stickerSet2.masks) {
                    r6Var.f48838w = true;
                }
            }
        }
        if (arrayList != null) {
            i11 = arrayList.size();
        } else {
            i11 = 0;
        }
        ArrayList arrayList2 = r6Var.f48836r;
        if (arrayList2 == null) {
            size = 0;
        } else {
            size = arrayList2.size();
        }
        int i13 = i11 + size;
        if (r6Var.f48837s != null && arrayList != null && !arrayList.isEmpty()) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) arrayList.get(i14);
                long j3 = inputStickerSet.f17215id;
                int i15 = 0;
                while (true) {
                    if (i15 < r6Var.f48837s.size()) {
                        if (((TLRPC.InputStickerSet) r6Var.f48837s.get(i15)).f17215id == j3) {
                            break;
                        }
                        i15++;
                    } else {
                        r6Var.f48837s.add(inputStickerSet);
                        break;
                    }
                }
            }
            r6Var.v = true;
        }
        if (i13 == 1) {
            if (r6Var.f48836r.size() >= 1) {
                r6Var.set((TLRPC.StickerSetCovered) r6Var.f48836r.get(0));
            } else if (arrayList != null && arrayList.size() >= 1) {
                zArr[0] = false;
                MediaDataController.getInstance(i10).getStickerSet((TLRPC.InputStickerSet) arrayList.get(0), 0, false, new q6(r6Var, 1));
                return;
            } else {
                r6Var.set(0);
            }
        } else {
            r6Var.set(i13);
        }
        r6Var.d(zArr[0]);
    }

    public static void b(r6 r6Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        r6Var.set(tL_messages_stickerSet);
        r6Var.d(false);
    }

    public static void c(r6 r6Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        r6Var.set(tL_messages_stickerSet);
        r6Var.d(true);
    }

    private void set(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        TLRPC.Document document;
        CharSequence charSequence;
        String string;
        if (tL_messages_stickerSet == null) {
            return;
        }
        SpannableString spannableString = new SpannableString("x " + tL_messages_stickerSet.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.h.f26345a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
        int i10 = 0;
        while (true) {
            if (i10 >= arrayList.size()) {
                document = null;
                break;
            } else if (arrayList.get(i10).f17201id == tL_messages_stickerSet.set.thumb_document_id) {
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
            spannableString.setSpan(new org.telegram.ui.Components.y5(document, this.f48832b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f48838w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    public final void d(boolean z10) {
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z10) {
            boolean z11 = false;
            this.H = ValueAnimator.ofFloat(this.f48840y, 1.0f);
            this.H.addUpdateListener(new bi.m7(12, this, (this.d == null || Math.abs(getMeasuredHeight() - (getPaddingBottom() + (this.d.getHeight() + getPaddingTop()))) > AndroidUtilities.dp(3.0f)) ? true : true));
            this.H.setInterpolator(wr.h);
            this.H.setStartDelay(150L);
            this.H.setDuration(400L);
            this.H.start();
            return;
        }
        this.f48840y = 1.0f;
        invalidate();
        post(new k5(this, 5));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.f48840y;
        if (f7 < 1.0f) {
            q90 q90Var = this.h;
            q90Var.setAlpha((int) ((1.0f - f7) * 255.0f));
            Path path = this.f48835n;
            path.rewind();
            float paddingLeft = getPaddingLeft();
            float paddingTop = getPaddingTop();
            float measuredWidth = getMeasuredWidth() - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            Path.Direction direction = Path.Direction.CW;
            path.addRect(paddingLeft, paddingTop, measuredWidth, AndroidUtilities.dp(12.0f) + paddingTop2, direction);
            float paddingLeft2 = getPaddingLeft();
            int paddingTop3 = getPaddingTop();
            path.addRect(paddingLeft2, AndroidUtilities.dp(16.0f) + paddingTop3, (((getMeasuredWidth() - getPaddingRight()) - getPaddingLeft()) * 0.46f) + getPaddingLeft(), AndroidUtilities.dp(28.0f) + getPaddingTop(), direction);
            q90Var.draw(canvas);
            invalidate();
        }
        if (this.d != null) {
            float f10 = 0.0f;
            if (this.f48840y > 0.0f) {
                canvas.save();
                float paddingLeft3 = getPaddingLeft();
                if (!LocaleController.isRTL) {
                    f10 = this.e;
                }
                canvas.translate(paddingLeft3 - f10, getPaddingTop());
                this.f48832b.setAlpha((int) (this.f48840y * 255.0f));
                this.d.draw(canvas);
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.d, this.f48834f, 0.0f, null, 0.0f, 0.0f, 0.0f, this.f48840y, this.f48833c);
                canvas.restore();
            }
        }
    }

    public wv getAlert() {
        if (this.f48837s == null) {
            int i10 = -this.G;
            this.G = i10;
            AndroidUtilities.shakeViewSpring(this, i10);
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            return null;
        }
        return new wv(null, getContext(), this.f48831a, this.f48837s);
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
        int dp = AndroidUtilities.dp(29.0f);
        StaticLayout staticLayout = this.d;
        if (staticLayout == null) {
            height = AndroidUtilities.dp(29.0f);
        } else {
            height = staticLayout.getHeight();
        }
        int paddingBottom = getPaddingBottom() + AndroidUtilities.lerp(dp, height, this.f48840y) + paddingTop;
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
        StaticLayout staticLayout = new StaticLayout(charSequence, this.f48832b, measuredWidth, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
        this.f48834f = org.telegram.ui.Components.y5.update(0, this, this.f48834f, this.d);
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
        String string;
        SpannableString spannableString = new SpannableString("x " + stickerSetCovered.set.title);
        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, this.h.f26345a)), 0, spannableString.length(), 33);
        spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        TLRPC.Document document = stickerSetCovered.cover;
        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
            ArrayList<TLRPC.Document> arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10).f17201id == stickerSetCovered.set.thumb_document_id) {
                    document = arrayList.get(i10);
                }
            }
            if (document == null && !arrayList.isEmpty()) {
                document = arrayList.get(0);
            }
        }
        if (document != null) {
            spannableString.setSpan(new org.telegram.ui.Components.y5(document, this.f48832b.getFontMetricsInt()), 0, 1, 33);
            charSequence = spannableString;
        } else {
            charSequence = spannableString.subSequence(2, spannableString.length());
        }
        boolean z10 = this.v;
        if (z10 && this.f48838w) {
            string = LocaleController.getString(R.string.StoryContainsStickersEmojiFrom);
        } else if (z10) {
            string = LocaleController.getString(R.string.StoryContainsEmojiFrom);
        } else {
            string = LocaleController.getString(R.string.StoryContainsStickersFrom);
        }
        setText(AndroidUtilities.replaceCharSequence("%s", string, charSequence));
    }

    private void set(int i10) {
        boolean z10 = this.v;
        q90 q90Var = this.h;
        if (z10 && this.f48838w) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickersEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, q90Var.f26345a), null));
        } else if (z10) {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsEmoji", i10, new Object[0]), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, q90Var.f26345a), null));
        } else {
            setText(AndroidUtilities.replaceSingleTag(LocaleController.formatPluralString("StoryContainsStickers", i10, new Object[0]), 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, q90Var.f26345a), null));
        }
    }
}
