package vb;

import com.googlecode.mp4parser.c;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import m5.i;
import wb.k;
public abstract class a extends c {
    public static final Logger f49497f;
    public static final i h;
    public ByteBuffer f49498e;

    static {
        be.a aVar = new be.a(a.class, "AbstractDescriptorBox.java");
        aVar.e(aVar.d("getData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.nio.ByteBuffer"));
        aVar.e(aVar.d("getDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor"));
        aVar.e(aVar.d("getDescriptorAsString", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "", "", "java.lang.String"));
        aVar.e(aVar.d("setDescriptor", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "com.googlecode.mp4parser.boxes.mp4.objectdescriptors.BaseDescriptor", "descriptor", "void"));
        h = aVar.e(aVar.d("setData", "com.googlecode.mp4parser.boxes.mp4.AbstractDescriptorBox", "java.nio.ByteBuffer", "data", "void"));
        f49497f = Logger.getLogger(a.class.getName());
    }

    @Override
    public final void _parseDetails(ByteBuffer byteBuffer) {
        Logger logger = f49497f;
        f(byteBuffer);
        this.f49498e = byteBuffer.slice();
        byteBuffer.position(byteBuffer.remaining() + byteBuffer.position());
        try {
            this.f49498e.rewind();
            k.a(-1, this.f49498e);
        } catch (IOException e10) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e10);
        } catch (IndexOutOfBoundsException e11) {
            logger.log(Level.WARNING, "Error parsing ObjectDescriptor", (Throwable) e11);
        }
    }

    @Override
    public final void getContent(ByteBuffer byteBuffer) {
        i(byteBuffer);
        this.f49498e.rewind();
        byteBuffer.put(this.f49498e);
    }

    @Override
    public final long getContentSize() {
        return this.f49498e.limit() + 4;
    }
}
