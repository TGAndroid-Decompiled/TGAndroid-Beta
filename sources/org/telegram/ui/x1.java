package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

public final class x1 extends View implements org.telegram.ui.Cells.i9 {

    public final d70 f44235a;

    public final k4 f44236b;

    public final ImageReceiver f44237c;
    public final org.telegram.ui.Components.y8 d;

    public f3 f44238e;

    public f3 f44239f;
    public f3 h;

    public f3 f44240n;

    public boolean f44241r;

    public int f44242s;
    public int v;

    public int f44243w;

    public int f44244x;

    public TL_iv.pageBlockEmbedPost f44245y;

    public x1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44235a = d70Var;
        this.f44236b = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f44237c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44239f;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f44238e;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
        f3 f3Var4 = this.f44240n;
        if (f3Var4 != null) {
            arrayList.add(f3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44239f;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f44238e;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
        f3 f3Var4 = this.f44240n;
        if (f3Var4 != null) {
            f3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44239f;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f44238e;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
        f3 f3Var4 = this.f44240n;
        if (f3Var4 != null) {
            f3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f44245y;
        if (pageblockembedpost == null) {
            return;
        }
        boolean z10 = pageblockembedpost instanceof b4;
        d70 d70Var = this.f44235a;
        int i11 = 0;
        if (z10) {
            canvas2 = canvas;
        } else {
            if (this.f44241r) {
                this.f44237c.draw(canvas);
            }
            if (this.f44239f != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.f44241r ? 54 : 0) + 32), AndroidUtilities.dp(this.f44238e != null ? 10.0f : 19.0f));
                m4.v(d70Var, canvas, this, 0);
                this.f44239f.draw(canvas, this);
                canvas.restore();
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (this.f44238e != null) {
                canvas.save();
                canvas.translate(AndroidUtilities.dp((this.f44241r ? 54 : 0) + 32), AndroidUtilities.dp(29.0f));
                m4.v(d70Var, canvas, this, i10);
                this.f44238e.draw(canvas, this);
                canvas.restore();
                i10++;
            }
            canvas2 = canvas;
            canvas2.drawRect(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(20.0f), this.f44244x - (this.f44245y.level == 0 ? AndroidUtilities.dp(6.0f) : 0), m4.f40320m1);
            i11 = i10;
        }
        if (this.h != null) {
            canvas2.save();
            canvas2.translate(this.f44242s, this.v);
            m4.v(d70Var, canvas2, this, i11);
            this.h.draw(canvas2, this);
            canvas2.restore();
            i11++;
        }
        if (this.f44240n != null) {
            canvas2.save();
            canvas2.translate(this.f44242s, this.v + this.f44243w);
            m4.v(d70Var, canvas2, this, i11);
            this.f44240n.draw(canvas2, this);
            canvas2.restore();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f44239f != null) {
            sb2.append(", ");
            sb2.append(this.f44239f.d.getText());
        }
        if (this.f44238e != null) {
            sb2.append(", ");
            sb2.append(this.f44238e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f44240n != null) {
            sb2.append(", ");
            sb2.append(this.f44240n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f44245y;
        int i12 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof b4;
            k4 k4Var = this.f44236b;
            int height = 0;
            if (z10) {
                this.f44242s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int iDp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f44245y;
                f3 f3VarQ = m4.q(this.f44235a, this, null, pageblockembedpost2.caption.text, iDp, this.v, pageblockembedpost2, this.f44236b);
                this.h = f3VarQ;
                if (f3VarQ != null) {
                    int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f44243w = height2;
                    height = AndroidUtilities.dp(4.0f) + height2;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f44245y;
                f3 f3VarP = m4.p(this.f44235a, this, null, pageblockembedpost3.caption.credit, iDp, 0, pageblockembedpost3, k4Var.C ? org.telegram.ui.Components.tv0.a() : Layout.Alignment.ALIGN_NORMAL, 0, this.f44236b);
                this.f44240n = f3VarP;
                if (f3VarP != null) {
                    height += this.f44240n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i12 = height;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                boolean z11 = j10 != 0;
                this.f44241r = z11;
                if (z11) {
                    TLRPC.Photo photoE = j4.e(k4Var.A, j10);
                    boolean z12 = photoE instanceof TLRPC.TL_photo;
                    this.f44241r = z12;
                    if (z12) {
                        String str = this.f44245y.author;
                        org.telegram.ui.Components.y8 y8Var = this.d;
                        y8Var.n(0L, str, null);
                        this.f44237c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photoE.sizes, AndroidUtilities.dp(40.0f), true), photoE), "40_40", y8Var, 0L, (String) null, k4Var.A, 1);
                    }
                }
                String str2 = this.f44245y.author;
                int iDp2 = size - AndroidUtilities.dp((this.f44241r ? 54 : 0) + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f44245y;
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                f3 f3VarP2 = m4.p(this.f44235a, this, str2, null, iDp2, 0, pageblockembedpost4, alignment, 1, this.f44236b);
                this.f44239f = f3VarP2;
                if (f3VarP2 != null) {
                    f3VarP2.f37923s = AndroidUtilities.dp((this.f44241r ? 54 : 0) + 32);
                    this.f44239f.v = AndroidUtilities.dp(this.f44238e != null ? 10.0f : 19.0f);
                }
                if (this.f44245y.date != 0) {
                    this.f44238e = m4.q(this.f44235a, this, LocaleController.getInstance().getChatFullDate().format(((long) this.f44245y.date) * 1000), null, size - AndroidUtilities.dp((this.f44241r ? 54 : 0) + 50), AndroidUtilities.dp(29.0f), this.f44245y, this.f44236b);
                } else {
                    this.f44238e = null;
                }
                int iDp3 = AndroidUtilities.dp(56.0f);
                if (this.f44245y.blocks.isEmpty()) {
                    this.f44242s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int iDp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f44245y;
                    f3 f3VarQ2 = m4.q(this.f44235a, this, null, pageblockembedpost5.caption.text, iDp4, this.v, pageblockembedpost5, this.f44236b);
                    this.h = f3VarQ2;
                    if (f3VarQ2 != null) {
                        int height3 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f44243w = height3;
                        iDp3 = org.telegram.messenger.y1.C(4.0f, height3, iDp3);
                    }
                    int i13 = iDp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f44245y;
                    f3 f3VarP3 = m4.p(this.f44235a, this, null, pageblockembedpost6.caption.credit, iDp4, 0, pageblockembedpost6, k4Var.C ? org.telegram.ui.Components.tv0.a() : alignment, 0, this.f44236b);
                    this.f44240n = f3VarP3;
                    if (f3VarP3 != null) {
                        iDp3 = this.f44240n.d.getHeight() + AndroidUtilities.dp(4.0f) + i13;
                    } else {
                        iDp3 = i13;
                    }
                } else {
                    this.h = null;
                    this.f44240n = null;
                }
                f3 f3Var = this.f44238e;
                if (f3Var != null) {
                    f3Var.f37923s = AndroidUtilities.dp((this.f44241r ? 54 : 0) + 32);
                    this.f44238e.v = AndroidUtilities.dp(29.0f);
                }
                f3 f3Var2 = this.h;
                if (f3Var2 != null) {
                    f3Var2.f37923s = this.f44242s;
                    f3Var2.v = this.v;
                }
                f3 f3Var3 = this.f44240n;
                if (f3Var3 != null) {
                    f3Var3.f37923s = this.f44242s;
                    f3Var3.v = this.v;
                }
                i12 = iDp3;
            }
            this.f44244x = i12;
        }
        setMeasuredDimension(size, i12);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (m4.l(this.f44235a, this.f44236b, motionEvent, this, this.h, this.f44242s, this.v)) {
            return true;
        }
        return m4.l(this.f44235a, this.f44236b, motionEvent, this, this.f44240n, this.f44242s, this.v + this.f44243w) || super.onTouchEvent(motionEvent);
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f44245y = pageblockembedpost;
        requestLayout();
    }
}
