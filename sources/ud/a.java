package ud;

import java.util.Iterator;
import w7.w;
public abstract class a implements Iterable {
    public final char f43674a;
    public final char f43675b;
    public final int f43676c = 1;

    public a(char c10, char c11) {
        this.f43674a = c10;
        this.f43675b = (char) w.a(c10, c11, 1);
    }

    @Override
    public final Iterator iterator() {
        return new b(this.f43674a, this.f43675b, this.f43676c);
    }
}
