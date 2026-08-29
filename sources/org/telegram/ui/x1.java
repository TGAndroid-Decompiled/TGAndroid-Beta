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
public final class x1 extends View implements org.telegram.ui.Cells.j9 {
    public final d70 f44427a;
    public final k4 f44428b;
    public final ImageReceiver f44429c;
    public final org.telegram.ui.Components.e9 d;
    public f3 f44430e;
    public f3 f44431f;
    public f3 h;
    public f3 f44432n;
    public boolean f44433r;
    public int f44434s;
    public int v;
    public int f44435w;
    public int f44436x;
    public TL_iv.pageBlockEmbedPost f44437y;

    public x1(Context context, d70 d70Var, k4 k4Var) {
        super(context);
        this.f44427a = d70Var;
        this.f44428b = k4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f44429c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f44431f;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.f44430e;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
        f3 f3Var4 = this.f44432n;
        if (f3Var4 != null) {
            arrayList.add(f3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f44431f;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.f44430e;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
        f3 f3Var4 = this.f44432n;
        if (f3Var4 != null) {
            f3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f44431f;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.f44430e;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
        f3 f3Var4 = this.f44432n;
        if (f3Var4 != null) {
            f3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f9;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f44437y;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof b4;
            d70 d70Var = this.f44427a;
            int i12 = 0;
            if (!z10) {
                if (this.f44433r) {
                    this.f44429c.draw(canvas);
                }
                int i13 = 54;
                if (this.f44431f != null) {
                    canvas.save();
                    if (this.f44433r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.f44430e != null) {
                        f9 = 10.0f;
                    } else {
                        f9 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f9));
                    m4.v(d70Var, canvas, this, 0);
                    this.f44431f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.f44430e != null) {
                    canvas.save();
                    if (!this.f44433r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    m4.v(d70Var, canvas, this, i10);
                    this.f44430e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f44436x;
                if (this.f44437y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, m4.f40377m1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f44434s, this.v);
                m4.v(d70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f44432n != null) {
                canvas2.save();
                canvas2.translate(this.f44434s, this.v + this.f44435w);
                m4.v(d70Var, canvas2, this, i12);
                this.f44432n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f44431f != null) {
            sb2.append(", ");
            sb2.append(this.f44431f.d.getText());
        }
        if (this.f44430e != null) {
            sb2.append(", ");
            sb2.append(this.f44430e.d.getText());
        }
        if (this.h != null) {
            sb2.append(", ");
            sb2.append(this.h.d.getText());
        }
        if (this.f44432n != null) {
            sb2.append(", ");
            sb2.append(this.f44432n.d.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f9;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f44437y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z11 = pageblockembedpost instanceof b4;
            k4 k4Var = this.f44428b;
            int i16 = 0;
            if (z11) {
                this.f44434s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f44437y;
                f3 q6 = m4.q(this.f44427a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f44428b);
                this.h = q6;
                if (q6 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f44435w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f44437y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (k4Var.C) {
                    alignment2 = org.telegram.ui.Components.bw0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                f3 p10 = m4.p(this.f44427a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f44428b);
                this.f44432n = p10;
                if (p10 != null) {
                    i16 += this.f44432n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f44433r = z10;
                if (z10) {
                    TLRPC.Photo e10 = j4.e(k4Var.A, j10);
                    boolean z12 = e10 instanceof TLRPC.TL_photo;
                    this.f44433r = z12;
                    if (z12) {
                        String str = this.f44437y.author;
                        org.telegram.ui.Components.e9 e9Var = this.d;
                        e9Var.n(0L, str, null);
                        this.f44429c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e10.sizes, AndroidUtilities.dp(40.0f), true), e10), "40_40", e9Var, 0L, (String) null, k4Var.A, 1);
                    }
                }
                String str2 = this.f44437y.author;
                if (this.f44433r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f44437y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                f3 p11 = m4.p(this.f44427a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f44428b);
                this.f44431f = p11;
                if (p11 != null) {
                    if (this.f44433r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p11.f37974s = AndroidUtilities.dp(i14 + 32);
                    f3 f3Var = this.f44431f;
                    if (this.f44430e != null) {
                        f9 = 10.0f;
                    } else {
                        f9 = 19.0f;
                    }
                    f3Var.v = AndroidUtilities.dp(f9);
                }
                if (this.f44437y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f44437y.date * 1000);
                    if (this.f44433r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.f44430e = m4.q(this.f44427a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f44437y, this.f44428b);
                } else {
                    this.f44430e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f44437y.blocks.isEmpty()) {
                    this.f44434s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f44437y;
                    f3 q9 = m4.q(this.f44427a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f44428b);
                    this.h = q9;
                    if (q9 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f44435w = height2;
                        dp3 = org.telegram.messenger.x3.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f44437y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (k4Var.C) {
                        alignment = org.telegram.ui.Components.bw0.a();
                    } else {
                        alignment = alignment3;
                    }
                    f3 p12 = m4.p(this.f44427a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f44428b);
                    this.f44432n = p12;
                    if (p12 != null) {
                        dp3 = this.f44432n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f44432n = null;
                }
                f3 f3Var2 = this.f44430e;
                if (f3Var2 != null) {
                    if (this.f44433r) {
                        i16 = 54;
                    }
                    f3Var2.f37974s = AndroidUtilities.dp(i16 + 32);
                    this.f44430e.v = AndroidUtilities.dp(29.0f);
                }
                f3 f3Var3 = this.h;
                if (f3Var3 != null) {
                    f3Var3.f37974s = this.f44434s;
                    f3Var3.v = this.v;
                }
                f3 f3Var4 = this.f44432n;
                if (f3Var4 != null) {
                    f3Var4.f37974s = this.f44434s;
                    f3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f44436x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!m4.l(this.f44427a, this.f44428b, motionEvent, this, this.h, this.f44434s, this.v)) {
            if (!m4.l(this.f44427a, this.f44428b, motionEvent, this, this.f44432n, this.f44434s, this.v + this.f44435w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f44437y = pageblockembedpost;
        requestLayout();
    }
}
