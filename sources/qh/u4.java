package qh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.y9;
public final class u4 implements y9 {
    public final int f46741a;
    public final Layout f46742b;
    public final int f46743c;
    public final int d;

    public u4(Layout layout, int i9, int i10, int i11) {
        this.f46741a = i11;
        this.f46742b = layout;
        this.f46743c = i9;
        this.d = i10;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f46741a) {
            case 0:
                return this.f46742b;
            case 1:
                return this.f46742b;
            default:
                return this.f46742b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f46741a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final int getRow() {
        switch (this.f46741a) {
            case 0:
                return 0;
            case 1:
                return 0;
            default:
                return 1;
        }
    }

    @Override
    public final Rect getSelectionBounds() {
        switch (this.f46741a) {
            case 0:
                return null;
            case 1:
                return null;
            default:
                return null;
        }
    }

    @Override
    public final CharSequence getText() {
        switch (this.f46741a) {
            case 0:
                return this.f46742b.getText();
            case 1:
                return this.f46742b.getText();
            default:
                return this.f46742b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f46741a) {
            case 0:
                return this.f46743c;
            case 1:
                return this.f46743c;
            default:
                return this.f46743c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f46741a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
