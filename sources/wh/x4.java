package wh;

import android.graphics.Rect;
import android.text.Layout;
import org.telegram.ui.Cells.x9;
public final class x4 implements x9 {
    public final int f50155a;
    public final Layout f50156b;
    public final int f50157c;
    public final int d;

    public x4(Layout layout, int i10, int i11, int i12) {
        this.f50155a = i12;
        this.f50156b = layout;
        this.f50157c = i10;
        this.d = i11;
    }

    @Override
    public final Layout getLayout() {
        switch (this.f50155a) {
            case 0:
                return this.f50156b;
            case 1:
                return this.f50156b;
            default:
                return this.f50156b;
        }
    }

    @Override
    public final CharSequence getPrefix() {
        switch (this.f50155a) {
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
        switch (this.f50155a) {
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
        switch (this.f50155a) {
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
        switch (this.f50155a) {
            case 0:
                return this.f50156b.getText();
            case 1:
                return this.f50156b.getText();
            default:
                return this.f50156b.getText();
        }
    }

    @Override
    public final int getX() {
        switch (this.f50155a) {
            case 0:
                return this.f50157c;
            case 1:
                return this.f50157c;
            default:
                return this.f50157c;
        }
    }

    @Override
    public final int getY() {
        switch (this.f50155a) {
            case 0:
                return this.d;
            case 1:
                return this.d;
            default:
                return this.d;
        }
    }
}
