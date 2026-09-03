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
public final class x1 extends View implements org.telegram.ui.Cells.k9 {
    public final p70 f39807a;
    public final l4 f39808b;
    public final ImageReceiver f39809c;
    public final org.telegram.ui.Components.z8 d;
    public f3 e;
    public f3 f39810f;
    public f3 h;
    public f3 f39811n;
    public boolean f39812r;
    public int f39813s;
    public int v;
    public int f39814w;
    public int f39815x;
    public TL_iv.pageBlockEmbedPost f39816y;

    public x1(Context context, p70 p70Var, l4 l4Var) {
        super(context);
        this.f39807a = p70Var;
        this.f39808b = l4Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f39809c = imageReceiver;
        imageReceiver.setRoundRadius(AndroidUtilities.dp(20.0f));
        imageReceiver.setImageCoords(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        this.d = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.f6) null);
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        f3 f3Var = this.f39810f;
        if (f3Var != null) {
            arrayList.add(f3Var);
        }
        f3 f3Var2 = this.e;
        if (f3Var2 != null) {
            arrayList.add(f3Var2);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            arrayList.add(f3Var3);
        }
        f3 f3Var4 = this.f39811n;
        if (f3Var4 != null) {
            arrayList.add(f3Var4);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f3 f3Var = this.f39810f;
        if (f3Var != null) {
            f3Var.attach(this);
        }
        f3 f3Var2 = this.e;
        if (f3Var2 != null) {
            f3Var2.attach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.attach(this);
        }
        f3 f3Var4 = this.f39811n;
        if (f3Var4 != null) {
            f3Var4.attach(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f3 f3Var = this.f39810f;
        if (f3Var != null) {
            f3Var.detach(this);
        }
        f3 f3Var2 = this.e;
        if (f3Var2 != null) {
            f3Var2.detach(this);
        }
        f3 f3Var3 = this.h;
        if (f3Var3 != null) {
            f3Var3.detach(this);
        }
        f3 f3Var4 = this.f39811n;
        if (f3Var4 != null) {
            f3Var4.detach(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i10;
        int i11;
        float f10;
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f39816y;
        if (pageblockembedpost != null) {
            boolean z4 = pageblockembedpost instanceof c4;
            p70 p70Var = this.f39807a;
            int i12 = 0;
            if (!z4) {
                if (this.f39812r) {
                    this.f39809c.draw(canvas);
                }
                int i13 = 54;
                if (this.f39810f != null) {
                    canvas.save();
                    if (this.f39812r) {
                        i11 = 54;
                    } else {
                        i11 = 0;
                    }
                    float dp = AndroidUtilities.dp(i11 + 32);
                    if (this.e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    canvas.translate(dp, AndroidUtilities.dp(f10));
                    n4.v(p70Var, canvas, this, 0);
                    this.f39810f.draw(canvas, this);
                    canvas.restore();
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (this.e != null) {
                    canvas.save();
                    if (!this.f39812r) {
                        i13 = 0;
                    }
                    canvas.translate(AndroidUtilities.dp(i13 + 32), AndroidUtilities.dp(29.0f));
                    n4.v(p70Var, canvas, this, i10);
                    this.e.draw(canvas, this);
                    canvas.restore();
                    i10++;
                }
                float dp2 = AndroidUtilities.dp(18.0f);
                float dp3 = AndroidUtilities.dp(6.0f);
                float dp4 = AndroidUtilities.dp(20.0f);
                int i14 = this.f39815x;
                if (this.f39816y.level == 0) {
                    i12 = AndroidUtilities.dp(6.0f);
                }
                canvas2 = canvas;
                canvas2.drawRect(dp2, dp3, dp4, i14 - i12, n4.f36347n1);
                i12 = i10;
            } else {
                canvas2 = canvas;
            }
            if (this.h != null) {
                canvas2.save();
                canvas2.translate(this.f39813s, this.v);
                n4.v(p70Var, canvas2, this, i12);
                this.h.draw(canvas2, this);
                canvas2.restore();
                i12++;
            }
            if (this.f39811n != null) {
                canvas2.save();
                canvas2.translate(this.f39813s, this.v + this.f39814w);
                n4.v(p70Var, canvas2, this, i12);
                this.f39811n.draw(canvas2, this);
                canvas2.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.AccDescrIVEmbedPost));
        if (this.f39810f != null) {
            sb.append(", ");
            sb.append(this.f39810f.d.getText());
        }
        if (this.e != null) {
            sb.append(", ");
            sb.append(this.e.d.getText());
        }
        if (this.h != null) {
            sb.append(", ");
            sb.append(this.h.d.getText());
        }
        if (this.f39811n != null) {
            sb.append(", ");
            sb.append(this.f39811n.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        Layout.Alignment alignment;
        int i13;
        int i14;
        float f10;
        Layout.Alignment alignment2;
        int size = View.MeasureSpec.getSize(i10);
        TL_iv.pageBlockEmbedPost pageblockembedpost = this.f39816y;
        int i15 = 1;
        if (pageblockembedpost != null) {
            boolean z10 = pageblockembedpost instanceof c4;
            l4 l4Var = this.f39808b;
            int i16 = 0;
            if (z10) {
                this.f39813s = AndroidUtilities.dp(18.0f);
                this.v = AndroidUtilities.dp(4.0f);
                int dp = size - AndroidUtilities.dp(50.0f);
                TL_iv.pageBlockEmbedPost pageblockembedpost2 = this.f39816y;
                f3 q10 = n4.q(this.f39807a, this, null, pageblockembedpost2.caption.text, dp, this.v, pageblockembedpost2, this.f39808b);
                this.h = q10;
                if (q10 != null) {
                    int height = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                    this.f39814w = height;
                    i16 = AndroidUtilities.dp(4.0f) + height;
                }
                TL_iv.pageBlockEmbedPost pageblockembedpost3 = this.f39816y;
                TL_iv.RichText richText = pageblockembedpost3.caption.credit;
                if (l4Var.D) {
                    alignment2 = org.telegram.ui.Components.kw0.a();
                } else {
                    alignment2 = Layout.Alignment.ALIGN_NORMAL;
                }
                f3 p10 = n4.p(this.f39807a, this, null, richText, dp, 0, pageblockembedpost3, alignment2, 0, this.f39808b);
                this.f39811n = p10;
                if (p10 != null) {
                    i16 += this.f39811n.d.getHeight() + AndroidUtilities.dp(4.0f);
                }
                i15 = i16;
            } else {
                long j10 = pageblockembedpost.author_photo_id;
                if (j10 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                this.f39812r = z4;
                if (z4) {
                    TLRPC.Photo e = k4.e(l4Var.B, j10);
                    boolean z11 = e instanceof TLRPC.TL_photo;
                    this.f39812r = z11;
                    if (z11) {
                        String str = this.f39816y.author;
                        org.telegram.ui.Components.z8 z8Var = this.d;
                        z8Var.n(0L, str, null);
                        this.f39809c.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(e.sizes, AndroidUtilities.dp(40.0f), true), e), "40_40", z8Var, 0L, (String) null, l4Var.B, 1);
                    }
                }
                String str2 = this.f39816y.author;
                if (this.f39812r) {
                    i12 = 54;
                } else {
                    i12 = 0;
                }
                int dp2 = size - AndroidUtilities.dp(i12 + 50);
                TL_iv.pageBlockEmbedPost pageblockembedpost4 = this.f39816y;
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                f3 p11 = n4.p(this.f39807a, this, str2, null, dp2, 0, pageblockembedpost4, alignment3, 1, this.f39808b);
                this.f39810f = p11;
                if (p11 != null) {
                    if (this.f39812r) {
                        i14 = 54;
                    } else {
                        i14 = 0;
                    }
                    p11.f33933s = AndroidUtilities.dp(i14 + 32);
                    f3 f3Var = this.f39810f;
                    if (this.e != null) {
                        f10 = 10.0f;
                    } else {
                        f10 = 19.0f;
                    }
                    f3Var.v = AndroidUtilities.dp(f10);
                }
                if (this.f39816y.date != 0) {
                    String format = LocaleController.getInstance().getChatFullDate().format(this.f39816y.date * 1000);
                    if (this.f39812r) {
                        i13 = 54;
                    } else {
                        i13 = 0;
                    }
                    this.e = n4.q(this.f39807a, this, format, null, size - AndroidUtilities.dp(i13 + 50), AndroidUtilities.dp(29.0f), this.f39816y, this.f39808b);
                } else {
                    this.e = null;
                }
                int dp3 = AndroidUtilities.dp(56.0f);
                if (this.f39816y.blocks.isEmpty()) {
                    this.f39813s = AndroidUtilities.dp(32.0f);
                    this.v = AndroidUtilities.dp(56.0f);
                    int dp4 = size - AndroidUtilities.dp(50.0f);
                    TL_iv.pageBlockEmbedPost pageblockembedpost5 = this.f39816y;
                    f3 q11 = n4.q(this.f39807a, this, null, pageblockembedpost5.caption.text, dp4, this.v, pageblockembedpost5, this.f39808b);
                    this.h = q11;
                    if (q11 != null) {
                        int height2 = this.h.d.getHeight() + AndroidUtilities.dp(4.0f);
                        this.f39814w = height2;
                        dp3 = org.telegram.messenger.y3.C(4.0f, height2, dp3);
                    }
                    int i17 = dp3;
                    TL_iv.pageBlockEmbedPost pageblockembedpost6 = this.f39816y;
                    TL_iv.RichText richText2 = pageblockembedpost6.caption.credit;
                    if (l4Var.D) {
                        alignment = org.telegram.ui.Components.kw0.a();
                    } else {
                        alignment = alignment3;
                    }
                    f3 p12 = n4.p(this.f39807a, this, null, richText2, dp4, 0, pageblockembedpost6, alignment, 0, this.f39808b);
                    this.f39811n = p12;
                    if (p12 != null) {
                        dp3 = this.f39811n.d.getHeight() + AndroidUtilities.dp(4.0f) + i17;
                    } else {
                        dp3 = i17;
                    }
                } else {
                    this.h = null;
                    this.f39811n = null;
                }
                f3 f3Var2 = this.e;
                if (f3Var2 != null) {
                    if (this.f39812r) {
                        i16 = 54;
                    }
                    f3Var2.f33933s = AndroidUtilities.dp(i16 + 32);
                    this.e.v = AndroidUtilities.dp(29.0f);
                }
                f3 f3Var3 = this.h;
                if (f3Var3 != null) {
                    f3Var3.f33933s = this.f39813s;
                    f3Var3.v = this.v;
                }
                f3 f3Var4 = this.f39811n;
                if (f3Var4 != null) {
                    f3Var4.f33933s = this.f39813s;
                    f3Var4.v = this.v;
                }
                i15 = dp3;
            }
            this.f39815x = i15;
        }
        setMeasuredDimension(size, i15);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!n4.l(this.f39807a, this.f39808b, motionEvent, this, this.h, this.f39813s, this.v)) {
            if (!n4.l(this.f39807a, this.f39808b, motionEvent, this, this.f39811n, this.f39813s, this.v + this.f39814w) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void setBlock(TL_iv.pageBlockEmbedPost pageblockembedpost) {
        this.f39816y = pageblockembedpost;
        requestLayout();
    }
}
