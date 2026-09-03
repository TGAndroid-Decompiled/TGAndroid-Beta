package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.w9;
public final class y4 implements w9 {
    public final int f46410a;
    public final Layout f46411b;
    public final int f46412c;
    public final int d;

    public y4(Layout layout, int i10, int i11, int i12) {
        this.f46410a = i12;
        this.f46411b = layout;
        this.f46412c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f46410a) {
            case 0:
                return this.f46411b;
            case 1:
                return this.f46411b;
            default:
                return this.f46411b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f46410a) {
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
        switch (this.f46410a) {
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
        switch (this.f46410a) {
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
        switch (this.f46410a) {
            case 0:
                return this.f46411b.getText();
            case 1:
                return this.f46411b.getText();
            default:
                return this.f46411b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f46410a) {
            case 0:
                return this.f46412c;
            case 1:
                return this.f46412c;
            default:
                return this.f46412c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f46410a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
