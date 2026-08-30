package vh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.x9;
public final class x4 implements x9 {
    public final int f46279a;
    public final Layout f46280b;
    public final int f46281c;
    public final int d;

    public x4(Layout layout, int i10, int i11, int i12) {
        this.f46279a = i12;
        this.f46280b = layout;
        this.f46281c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f46279a) {
            case 0:
                return this.f46280b;
            case 1:
                return this.f46280b;
            default:
                return this.f46280b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f46279a) {
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
        switch (this.f46279a) {
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
        switch (this.f46279a) {
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
        switch (this.f46279a) {
            case 0:
                return this.f46280b.getText();
            case 1:
                return this.f46280b.getText();
            default:
                return this.f46280b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f46279a) {
            case 0:
                return this.f46281c;
            case 1:
                return this.f46281c;
            default:
                return this.f46281c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f46279a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
