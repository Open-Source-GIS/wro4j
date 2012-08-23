package ro.isdc.wro.cache;

/**
 * A {@link CacheStrategy} implementation which doesn't cache. Useful when disableCache configuration property is set to
 * true.
 * 
 * @author Alex Objelean
 * @created 24 Aug 2012
 * @since 1.4.9
 */
public class NoOpCacheStrategy
    implements CacheStrategy<CacheEntry, ContentHashEntry> {
  /**
   * {@inheritDoc}
   */
  public void put(final CacheEntry key, final ContentHashEntry value) {
  }

  /**
   * {@inheritDoc}
   */
  public ContentHashEntry get(final CacheEntry key) {
    return null;
  }

  /**
   * {@inheritDoc}
   */
  public void clear() {
  }

  /**
   * {@inheritDoc}
   */
  public void destroy() {
  }
}
